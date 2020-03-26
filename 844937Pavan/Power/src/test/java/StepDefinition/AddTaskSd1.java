package StepDefinition;

import java.io.IOException;

import Pages.AddTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTaskSd1 
{
	AddTask a=new AddTask();//creating object for the AddTask class 
	@Given("^Launch the Website in the Browser$")
	public void launch_the_Website_in_the_Browser() 
	{
		a.laaunch();
	}

	@When("^Click on the AddNewTask$")
	public void click_on_the_AddNewTask() 
	{
		a.Add_Task();
	}

	@Then("^Enter all the details$")
	public void enter_all_the_details() 
	{
		a.Add_Details();
	}

	@Then("^Slect the Start Date$")
	public void slect_the_Start_Date() 
	{
		a.StartDate();
	}

	@Then("^Select the End Date$")
	public void select_the_End_Date() 
	{
		a.EndDate();
	}

	@Then("^Click on the Add button$")
	public void click_on_the_Add_button() 
	{
		a.Send();
	}
	@Then("Take screenshot")
	public void take_screenshot() throws IOException, InterruptedException 
	{
		a.screenshot();
	}

}
