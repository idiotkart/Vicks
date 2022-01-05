package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Step 1");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Step 2");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Step 3");
    }

    @And("^All Cards are displayed$")
    public void all_cards_are_displayed() throws Throwable {
    	System.out.println("Step 4");
    }

}
