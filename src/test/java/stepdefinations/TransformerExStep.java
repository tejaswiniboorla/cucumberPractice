
  package stepdefinations;
  
  import io.cucumber.java.ParameterType; import io.cucumber.java.en.Given;
  
  public class TransformerExStep {
  
  @ParameterType("[a-zA-Z]+")
  public String color(String color) 
  {
	  return color;
  }
  
  @ParameterType("\\d+")
  public Integer age(String age) { 
	  
	  return Integer.valueOf(age);
   
  }
  
  @Given("the color is {color}") 
  public void theColorIs(String color) {
  System.out.println("Selected color: "+color);
  
  }
  
  @Given("age is {age}")
  public void age_is(Integer age) {
  System.out.println("AGE USED: "+age);
  
  
  }
  
  }
  
  
  
 

