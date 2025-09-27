import io.restassured.RestAssured;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TrelloTest {


    @BeforeAll
    public static void setBaseURL(){
        RestAssured.baseURI="https://trello.com";
    }

    @Test
    public void TrelloAPITest(){
        RestAssured.given()
                .log().all()
                .get()
                //.prettyPeek()
                .then()
                .statusCode(200)
                .log().status();

    }
}
