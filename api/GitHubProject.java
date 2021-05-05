package activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitHubProject {
    
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    String sshKey;
    int sshId;

    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec = new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .build();
        
        sshKey="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDGbihigSrLNJ+ZVNmhzow0BmQWu3dH03e4uCGhlS8BgElLHdbO5qrw1KIQMeNU+Va4OfwO4w0hafjgF3j+m7ViYrRIWoJfaQfP+VqURsVFxogZjUYGhmgNzAmK2In88JqE3SfbIMFUJa98/2tyl2rf/nLIQPSZPPWaYiZMqESZ+TLZYbfZMVrFnwSLfxa7nO2anFuG/Svns9PAGlfgDgAoszWWN8iWdFcV/Y75Wafv+f0nbNwzKNveuYU5L1/LbybQHiXhI/pUJq0KytI35a8dzBTp1aNZ58WeWEWeXvYo0RMZTpbBmi09VjR8h2Dbt/w7k0AiCLTQY8z9HrmNzIB3";
        //System.out.println(sshKey);
    }

    @Test(priority=1)
    public void addKeys() {
        //String reqBody = "{\"title\": \"TestKey\", \"key\": \"" + sshKey + "\"}";
        //String reqBody = "{\"title\": \"TestKey\", \"key\":  + sshKey}";
    	//String reqBody = "{\"title\": \"TestKey\", \"key\":  \""+sshKey +"\", \"read_only\": true}";
    	String reqBody = "{\"title\": \"TestKey\", \"key\": \"" + sshKey + "\"}";
    	System.out.println(reqBody);
    	
//        Response response = given().spec(requestSpec)
//        		 .body(reqBody) // Send request body
//                .when().post("/user/keys"); // Send POST request

    	
        Response response = given().spec(requestSpec)
       		 .body(reqBody) // Send request body
              .when().post("/user/keys"); // Send POST request
        // Assertions
        
        String respbody=response.getBody().asPrettyString();
        System.out.println("From Addkeys method..");
        System.out.println(respbody);
        sshId=response.then().extract().path("id");
        response.then().statusCode(201);
    }

    @Test( priority=2)
    public void getKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .when().get("/user/keys"); // Send GET request

        String respbody=response.getBody().asPrettyString();
        System.out.println("From GetKeys method..");
        System.out.println(respbody);
        
        response.then().statusCode(200);
    }
   
    @Test(priority=3)
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", sshId) // Add path parameter
                .when().delete("/user/keys/{keyId}"); // Send GET request
        String respbody=response.getBody().asPrettyString();
        System.out.println("From DeleteKeys method..");
        System.out.println(respbody);

        response.then().statusCode(204);
    }

}