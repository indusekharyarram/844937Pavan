package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search
{
	  protected WebDriver driver;
	  By TaskList=By.xpath("(//img[@border='0'])[2]");
	  By Pro=By.xpath("(//option[@value='6'])[2]");
	  By search=By.xpath("(//input[@name='DoSearch'])");
	  By Username=By.name("login");
	    By Password=By.name("password");
	    By login=By.name("DoLogin");
//To launch the  browser	  
	  public void launch()
	  {  
	   	System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("http://examples.codecharge.com/TaskManager/Default.php");
	  	driver.findElement(By.xpath("//img[@src='images/administration-button.gif']")).click();
	  	driver.findElement(Username).sendKeys("admin");
	  	driver.findElement(Password).sendKeys("admin");
	  	driver.findElement(login).click();
	  }
//click on Task list	  
	public void Click_taskList()
	{
		driver.findElement(TaskList).click();
	}
//click on the project	
	public void click_project()
	{
		driver.findElement(Pro).click();
	}
//search for the Newly entered project	
	public void click_Search() throws InterruptedException
	{
		driver.findElement(search).click();
		Thread.sleep(5000);
		driver.close();
	}
	}


