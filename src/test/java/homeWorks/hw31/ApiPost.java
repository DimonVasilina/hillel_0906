package homeWorks.hw31;

import lesson31.SuccessUserResp;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class ApiPost {


    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testUpdateData() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        SuccessUserRequest successUserRequest = new SuccessUserRequest("morpheus", "leader");
        UserResponse userResponse = given()
                .body(successUserRequest)
                .when()
                .post("/api/users")
                .then()
                .log().all()
                .statusCode(201)
                .extract().as(UserResponse.class);

        Assert.assertEquals(userResponse.getName(), "morpheus");
        Assert.assertEquals(userResponse.getJob(), "leader");
        Assert.assertNotNull(userResponse.getId());
        Assert.assertNotNull(userResponse.getCreatedAt());
    }
}