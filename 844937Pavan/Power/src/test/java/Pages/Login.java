package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login
{
	    WebDriver driver;
		By Administration= By.xpath("/html/body/table/tbody/tr[2]/td[3]/a/img");
		By Username=By.name("login");
		By Password=By.name("password");
		By login=By.name("DoLogin");
//To launch the Browser	
		public void Launch()
		{
			String browser="Chrome";
			if(browser.equalsIgnoreCase("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
			}
		}

//To open the TaskManager Website		
		public void open()
		{
			driver.get("http://examples.codecharge.com/TaskManager/Default.php");
			driver.findElement(Administration).click();
		
		}	
//  To enter the login credentials		
		public void Enter()
		{
			driver.findElement(Username).sendKeys("admin");
			driver.findElement(Password).sendKeys("admin");
		}
// To click on the login button
		public void click() throws InterruptedException
		{
			
			driver.findElement(login).click();
			Thread.sleep(5000);
			driver.close();
		}
		

}

