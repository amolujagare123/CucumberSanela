package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetailsSD {

    @Given("I am on user details page")
    public void i_am_on_user_details_page() throws Throwable {
        System.out.println("I am on user details page");
    }

    @When("I enter user details")
    public void i_enter_user_details() throws Throwable {
        System.out.println("I enter user details");
    }

    @Then("the details should be submitted")
    public void the_details_should_be_submitted() throws Throwable {
        System.out.println("the details should be submitted");
    }
}
