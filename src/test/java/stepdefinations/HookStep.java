package stepdefinations;

import io.cucumber.java.en.*;

public class HookStep {
	
	@Given("testing given criteria")
	public void testing_given_criteria()
	{
	    System.out.println("Given");
	}
	@When("testing when criteria")
	public void testing_when_criteria()  
	{
		System.out.println("When");
	}
	@Then("testing then criteria")
	public void testing_then_criteria()
	{
		System.out.println("Then");
	}

}
