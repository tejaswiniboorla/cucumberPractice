
  package stepdefinations;
  
  import java.util.Map; import java.util.Map.Entry;
  
  import io.cucumber.datatable.DataTable; import io.cucumber.java.en.*;
  
  public class DatatableExStep {
  
  @Given("user is on sign up screen") public void user_is_on_sign_up_screen() {
  System.out.println("Given"); }
  
  @Then("user enter details") public void user_enter_details(DataTable
  dataTable) { Map<String,String>data=dataTable.asMap();
  for(Entry<String,String>e:data.entrySet()) {
  System.out.println(e.getKey()+":"+e.getValue()); }
  
  } }
 