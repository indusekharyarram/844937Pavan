package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddTask
{
 
   protected WebDriver driver;
	  By TaskList=By.xpath("(//img[@border='0'])[2]");
	  By Username=By.name("login");
	  By Password=By.name("password");
	  By login=By.name("DoLogin");
	  By AddTask=By.linkText("Add New Task");
	  By Pro = By.xpath("(//option[@value='6'])[2]");
	  By search=By.xpath("(//input[@name='DoSearch'])");
	  By Add=By.xpath("(//input[@name='Insert'])");
	 public void laaunch()
	    {
				
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://examples.codecharge.com/TaskManager/Default.php");
				driver.findElement(By.xpath("//img[@src='images/administration-button.gif']")).click();
			  	driver.findElement(Username).sendKeys("admin");
			  	driver.findElement(Password).sendKeys("admin");
			  	driver.findElement(login).click();
			  	driver.findElement(TaskList).click();
			  	driver.findElement(Pro).click();
			  	driver.findElement(search).click();
			  	
	     }
// To click on Add task
	  public void Add_Task()
	     {
	           
	           driver.findElement(AddTask).click();
	     }
//  To enter the details	  
	  public void Add_Details()
	    {
		        
		        driver.findElement(By.xpath("(//input[@maxlength='100'])[1]")).sendKeys("TaskManagement");
		        
		        driver.findElement(By.xpath("(//textarea[@cols='51'])[1]")).sendKeys("TaskManagement Website");
		        
		        driver.findElement(By.xpath("(//option[@value='1'])")).click();
		        
		        driver.findElement(By.xpath("(//option[@value='2'])[2]")).click();
		        
		        driver.findElement(By.xpath("(//option[@value='1'])[3]")).click();
		       
		        driver.findElement(By.xpath("(//option[@value='1'])[4]")).click();
		       
		        driver.findElement(By.xpath("(//option[@value='16'])[1]")).click();
	     }
//To select the Start date	 
	  public void StartDate() 
	    {
		        Actions action=new Actions(driver);
		        action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[8]/td/a/img"))).click().build().perform();
		        String parent=driver.getWindowHandle();
		        System.out.println(parent);
		        Set<String>allWindows=driver.getWindowHandles();
	      for(String Window:allWindows)
		   {
			      System.out.println(Window);
			      if(!parent.equalsIgnoreCase(Window))
			  {
				  driver.switchTo().window(Window);
			  }
			
		   }
		       Actions actions=new Actions(driver);
		       actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[4]/td[3]/a"))).click().build().perform();
		       driver.switchTo().window(parent);
	    }
// To select the End date	  
	public void EndDate()
	   {
		      Actions action=new Actions(driver);
		      action.moveToElement(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table[2]/tbody/tr[9]/td/a/img"))).click().build().perform();
		      String parent=driver.getWindowHandle();
	          System.out.println(parent);
		      Set<String>allWindows=driver.getWindowHandles();
		      for(String Window:allWindows)
		   {
			     System.out.println(Window);
			     if(!parent.equalsIgnoreCase(Window))
			   {
				   driver.switchTo().window(Window);
			   }
		   }
		     Actions actions=new Actions(driver);
		     actions.moveToElement(driver.findElement(By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[5]/td[6]/a"))).click().build().perform();
		     driver.switchTo().window(parent);
	   }
// To click on the Send button	
	public void Send()
	   {
		     
		     driver.findElement(Add).click();
		
	   }
//To take screenshot	
    public void screenshot() throws IOException, InterruptedException 
	  {
		//To take screenshot 
			TakesScreenshot ts=((TakesScreenshot)driver);
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("Screenshots\\TaskScreenshot.jpg"));
			Thread.sleep(5000);
			driver.close();
		
	  }
}
