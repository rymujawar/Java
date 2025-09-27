import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


import static org.hamcrest.Matchers.equalTo;

public class FetchBookingTest {

    @BeforeAll
    public static void setBaseURL() {
        RestAssured.baseURI = "http://localhost:3000";
    }

    public RequestSpecification requestWithAuth() {
        return RestAssured.given()
                .header("Accept", "*/*")
                .contentType("application/json");
    }

    @Test
    public void prettyPrintJsonManually() throws Exception {
        Response response = requestWithAuth()
                .pathParam("id", "1")
                .get("/booking/{id}");

        String rawJson = response.getBody().asString();

        ObjectMapper mapper = new ObjectMapper();
        Object json = mapper.readValue(rawJson, Object.class);
        ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
        String prettyJson = writer.writeValueAsString(json);

        System.out.println("🎯 Formatted JSON:\n" + prettyJson);
    }


    @Test
    public void getAllBookingIds() {
        Response response = requestWithAuth()
                .pathParam("id", "1") // pass as string
                .when()
                .get("/booking/{id}");

        // Validate status and JSON content
        response.then()
                .statusCode(200)
                .body("id", equalTo("1")) // ✅ Match as String
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/BookingJsonSchema.json"));

        // Extract and assert firstname
        String firstName = response.jsonPath().getString("firstname");
        Assertions.assertEquals("Jim", firstName);
    }

    @Test
    public void checkBookingInvalidId(){
        Response response = requestWithAuth()
                .pathParam("id","R9")
                .get("/booking/{id}");
                response.then()
                        .statusCode(404);
//  actual response
        Assertions.assertEquals("Not Found", response.body().asString());

        // Option check
         Assertions.assertTrue(response.body().asString().contains("Not Found"));
    }
    @Test
    public void testBookingWithAuthAndCheckDates() {
        Response response = requestWithAuth()
                .pathParam("id", "1")
                .get("/booking/{id}");

        response.prettyPrint(); // Debug output

        response.then()
                .statusCode(200)
                .body("firstname", equalTo("Jim"))
                .body("bookingdates.checkin", equalTo("2018-01-01"))
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/BookingJsonSchema.json"));

        String checkin = response.jsonPath().getString("bookingdates.checkin");
        Assertions.assertEquals("2018-01-01", checkin);
    }


    @AfterAll
    public static void statusCheck() {
        System.out.println("===> getAllBookingIds - Test successful! <===");
    }
}
