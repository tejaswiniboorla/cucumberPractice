
  package stepdefinations;
  
  import io.cucumber.java.en.*;
  
  public class BackgroundStep {
  
  @Given("first")
  public void first() 
  { 
	  System.out.println("first"); 
  }
  
  @When("second") 
  public void second() 
  { 
	  System.out.println("second"); 
  }
  
  @Then("third") 
  public void third() 
  { 
	  System.out.println("third"); 
  }
  
  @Given("I want to write a step with precondition") 
  public void i_want_to_write_a_step_with_precondition() 
  {
	  System.out.println("Given");
  }
  
  @When("I complete action") 
  public void i_complete_action()
  {
	  System.out.println("When"); 
  }
 
  @Then("I validate the outcomes") 
  public void i_validate_the_outcomes() 
  {
	  System.out.println("Then"); 
  }
  
  }
 

