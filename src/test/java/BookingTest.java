import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.hasItems;

public class BookingTest {

    @BeforeAll
    public static void setBaseURL() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @Test
    public void getAllBookingIds() {
        RestAssured
                .given()
                .when()
                .get("/booking")
                .then()
                .statusCode(200)
                //.log().all()
                .body("bookingid",hasItems(200)); //check if booking id is present

                    }
}
