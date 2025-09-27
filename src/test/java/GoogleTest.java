import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GoogleTest {

    @BeforeAll
    public static void setBaseURL(){
        RestAssured.baseURI="https://www.google.com";
    }
    @Test
    public void GoogleAPITest(){
        RestAssured.given()
                .log().all()
                .get()
                .prettyPeek()
                .then()
                .statusCode(200);
    }
}
