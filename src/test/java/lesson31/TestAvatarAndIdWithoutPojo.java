package lesson31;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class TestAvatarAndIdWithoutPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testAvatarAndId() {
        Response response = given()
                .when()
                .get(BASE_URL + "api/users?page=2")
                .then().log().all()
                .body("page", equalTo(2))
                .body("data.id", notNullValue())
                .body("data.email", notNullValue())
                .body("data.first_name", notNullValue())
                .body("data.last_name", notNullValue())
                .body("data.avatar", notNullValue())
                .extract().response();

        JsonPath jsonPath = response.jsonPath();
        List<Integer> ids = jsonPath.get("data.id");
        List<String> email = jsonPath.get("data.email");
        List<String> avatar = jsonPath.get("data.avatar");

        for (int i = 0; i < avatar.size(); i++) {
            Assert.assertTrue(avatar.get(i).contains(ids.get(i).toString()));
        }

        Assert.assertTrue(email.stream().allMatch(x -> x.endsWith("reqres.in")));
    }
}