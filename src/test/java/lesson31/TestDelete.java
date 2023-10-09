package lesson31;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class TestDelete {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testDelete() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();

    }
}