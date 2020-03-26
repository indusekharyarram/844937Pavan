package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProject
{
	protected WebDriver driver;
	By add=By.xpath("(//input[@name='Insert'])");
//launch the website
	public void launch()
	{   
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/TaskManager/Default.php");
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[3]/a/img")).click();
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input")).click();
	}
// To click on the projects	
	public void projects()
	{
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr[3]/td/a")).click();
	}
// To click on add New Project 
	public void Addnew_Project()
	{
		driver.findElement(By.linkText("Add New Project")).click();
	}
//To enter the New Project name	
	public void project()
	{
		driver.findElement(By.xpath("(//input[@maxlength='50'])")).sendKeys("CTS Selenium");
	}
//	To click on the add button
	public void Click_Add() throws InterruptedException
	{
		driver.findElement(add).click();
		Thread.sleep(5000);
		driver.close();
	}
	}

