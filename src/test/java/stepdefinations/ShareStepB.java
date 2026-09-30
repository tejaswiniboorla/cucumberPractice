package stepdefinations;

import io.cucumber.java.en.When;
import sharedData.CompanyData;

public class ShareStepB {
	@When("variable comes here second")
	public void variable_comes_here_second() 
	{
	    System.out.println("Step2:"+CompanyData.getCompanyName());
}
}