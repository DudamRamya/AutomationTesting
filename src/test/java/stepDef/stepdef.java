package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class stepdef {

	
		
		@Given("the get request url with {string}")
		public void the_get_request_url_with(String string) {
		    
			given().when()
			.get("https://dummy.restapiexample.com/api/v1/employee/1");
			System.out.println(string);
		}

		@When("we hit the get request")
		public void we_hit_the_get_request() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Then("response is generated")
		public void response_is_generated() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		
				}

