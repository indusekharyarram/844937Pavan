package StepDefinition;

import Pages.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchSd
{
	Search s=new Search();
	@Given("^Open the website in the Browser$")
	public void open_the_website_in_the_Browser() 
	{
		s.launch();
	}

	@When("^Click On Task List$")
	public void click_On_Task_List() 
	{
		s.Click_taskList();
	}

	@When("^Select the Newly Entered Project$")
	public void select_the_Newly_Entered_Project() 
	{
		s.click_project();
	}

	@When("^Click on the Search button$")
	public void click_on_the_Search_button() throws InterruptedException 
	{
		s.click_Search();
	}

}
