package acc.br;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import acc.br.model.Fruta;
import antlr.collections.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    public void testFrutas() {
        given()
          .when().get("/frutas")
          .then()
             .statusCode(200);
    }

}