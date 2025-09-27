import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class BoardsTest {

    @BeforeAll
    public static void CheckBoardsTest(){
        RestAssured.baseURI="https://api.trello.com";
    }
    @Test
    public void checkGetBoards()
    {
        RestAssured.given()
        //@BeforeAll
        //public static void CheckBoardsTest(){
       // RestAssured.baseURI="https://api.trello.com";

                .pathParam("member","learnpostman")
                .queryParams(Map.of(
                        "key","cf3fee0409c8",
                        "token","4566ab044f2746db85a2cf3fee0409c8"))
                .get("/1/members/{member}/boards")
                .prettyPeek()
                .then()
                .statusCode(401);
    }
}
