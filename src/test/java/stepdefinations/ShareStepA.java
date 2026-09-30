package stepdefinations;

import io.cucumber.java.en.Given;
import sharedData.CompanyData;

public class ShareStepA {
	

	@Given("variable comes here first")
	public void variable_comes_here_first() 
	{
	CompanyData.setCompanyName("TCS");
	System.out.println("Step1:"+CompanyData.getCompanyName());
	CompanyData.setCompanyName("Infosys");

}
	}
