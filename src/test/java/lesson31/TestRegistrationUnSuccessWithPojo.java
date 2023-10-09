package lesson31;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestRegistrationUnSuccessWithPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testRegistrationUnSuccess() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(400));

        UserForReg userForReg = new UserForReg("sydney@fife", "");
        ErrorPojo errorPojo = given()
                .body(userForReg)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(ErrorPojo.class);

        Assert.assertEquals(errorPojo.getError(), "Missing password");


    }
}