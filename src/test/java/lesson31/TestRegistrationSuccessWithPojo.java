package lesson31;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestRegistrationSuccessWithPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testRegistrationSuccess() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));

        UserForReg userForReg = new UserForReg("eve.holt@reqres.in", "pistol");
        SuccessUserResp successUserResp = given()
                .body(userForReg)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessUserResp.class);

        Assert.assertEquals(successUserResp.getId(), 4);
        Assert.assertEquals(successUserResp.getToken(), "QpwL5tke4Pnpja7X4");

    }
}