package stepdefinations;

import io.cucumber.java.en.*;


public class LoginStep {

	
	  @Given("User is on login screen") 
	  public void user_is_on_login_screen()
	  {
	  	  System.out.println("Given");
	  }
	  
	  @When("User enter {string} as username") 
	  public void user_enter_as_username(String username) 
	  {
	  	  System.out.println(username); 
	  }
	  
	  @When("User enter {string} as password") 
	  public void user_enter_as_password(String pass)
	  {
	  	  System.out.println(pass);
	  }
	  
	  @Then("User is Logged In") 
	  public void user_is_logged_in() 
	  {
	  	   System.out.println("Then");
	  }
	 
}
