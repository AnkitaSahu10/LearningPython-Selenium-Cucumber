package Step_Definition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition1 {

    @Given("^User is on landing Page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("navigated to landing page : Given");
       // throw new PendingException();
    }

    @When("^Login into application by (.+) and password (.+)$")
    public void login_into_application_by_and_password(String username, String password) throws Throwable {
        // throw new PendingException();
      //  throw new PendingException();
    	
    	System.out.println("Trying to login : When PARAMETRIZATION");
    	System.out.println(username);
    	System.out.println(password);
    }
    @When("^User Login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       // throw new PendingException();
    	System.out.println("Trying to login : When");
        
    }
    @When("^User Login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       // throw new PendingException();
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	System.out.println("Trying to login with regular expression : When");
        
    }
    
    
    

    @When("^User Login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
        //throw new PendingException();
    	System.out.println("Data Driven");
    	List<List<String>> datais = data.asLists();
    	System.out.println(datais.get(0).get(0));
    	System.out.println(datais.get(0).get(1));
    	System.out.println(datais.get(0).get(2));
    	System.out.println(datais.get(0).get(3));
    	System.out.println(datais.get(0).get(4));
    }

    @Then("^Cards displayed = \"([^\"]*)\"$")
    public void cards_displayed_something(String strArg1) throws Throwable {
       // throw new PendingException();
    	System.out.println("Card dispaly?");
     	System.out.println(strArg1);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       // throw new PendingException();
    	System.out.println("Home page is up : Then");
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
       // throw new PendingException();
    	System.out.println("Cards are visible : And ");
    }
    
    	@And("^Cards are not displayed$")
        public void cards_are_not_displayed() throws Throwable {
           // throw new PendingException();
        	System.out.println("Cards are not visible : And ");

    }
    	
    	@Given("^Validate the browser$")
        public void validate_the_browser() throws Throwable {
          //  throw new PendingException();
    		System.out.println("Browservalidate ");
        }

        @When("^Browser is triggered$")
        public void browser_is_triggered() throws Throwable {
           // throw new PendingException();
        	System.out.println("Browser triggered ");
        }

        @Then("^Check if browser is started$")
        public void check_if_browser_is_started() throws Throwable {
            //throw new PendingException();
        	System.out.println("Browser started ");
        }

}