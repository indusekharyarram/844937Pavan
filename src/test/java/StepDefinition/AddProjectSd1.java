package StepDefinition;

import Pages.AddProject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AddProjectSd1 
{
	
    AddProject p=new AddProject();//Creating object for the AddProject Class
	
	@Given("^Open the Website in the Browser$")
	public void open_the_Website_in_the_Browser()
	{
		p.launch();
	}

	@When("^Click on the Projects$")
	public void click_on_the_Projects() 
	{
		p.projects();
	}

	@Then("^Click on the Add New Project$")
	public void click_on_the_Add_New_Project() 
	{
		p.Addnew_Project();
	}

	@Then("^Enter the Project Name$")
	public void enter_the_Project_Name() 
	{
		p.project();
	}

	@Then("^Click on the Add Button$")
	public void click_on_the_Add_Button() throws InterruptedException 
	{
		p.Click_Add();
	}
}
