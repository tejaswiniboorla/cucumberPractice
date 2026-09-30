  package stepdefinations;

import io.cucumber.java.en.*;

public class OutlineStep {
  
  @Given("I want to write a step with {string}")
  public void i_want_to_write_a_step_with(String string) 
  {
	  System.out.println("given:"+string);
}
  @When("I check for the {int} in step")
  public void i_check_for_the_in_step(Integer int1)
  {
	  System.out.println("when:"+int1);
  }
  @Then("I verify the {string} in step")
  public void i_verify_the_in_step(String string)
  {
	  System.out.println("then:"+string);
  }
  }
 