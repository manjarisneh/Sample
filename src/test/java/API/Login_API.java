package API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Login_API extends PageObject {

@Test
public void getRequests()
{

//Response res=given().when().get("http://google.com");
////JsonPath jpath=new JsonPath((File) res);
//System.out.println(res);

    RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
    RequestSpecification httpRequest=RestAssured.given();
    Response response=httpRequest.request(Method.GET,"/employees");
    String responseBody=response.getBody().toString();
    //System.out.println(responseBody);
    int statusCode=response.getStatusCode();
    Assert.assertEquals(statusCode,200);
}
}
