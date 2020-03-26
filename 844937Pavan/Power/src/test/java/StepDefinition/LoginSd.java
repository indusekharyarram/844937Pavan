package StepDefinition;

import Pages.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSd 
{

	Login l=new Login();//creating object for the Login class
	
	@Given("launch the browser")
	public void launch_the_browser() 
	{
		l.Launch();
	}

	@When("open TaskManager website")
	public void open_TaskManager_website() 
	{
		l.open();
	}

	@Then("enter Username and Password")
	public void enter_Username_and_Password()
	{
		l.Enter();
	}
		

	@Then("click on Login button")
	public void click_on_Login_button() throws InterruptedException
	{
		l.click();
	}

}
