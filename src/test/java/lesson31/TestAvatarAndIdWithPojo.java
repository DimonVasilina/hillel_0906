package lesson31;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestAvatarAndIdWithPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testAvatarAndId() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));
        List<UserData> userDataList = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        Assert.assertTrue(userDataList.stream().allMatch(x -> x.getEmail().endsWith("reqres.in")));

        List<String> ids = userDataList.stream().map(x -> x.getId().toString()).toList();
        List<String> avatars = userDataList.stream().map(UserData::getAvatar).toList();

        for (int i = 0; i < ids.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }
}