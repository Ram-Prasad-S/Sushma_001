package loginTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase002 {
	
	WebDriver driver;
	
  @Test
  public void LoginFunctionalty() throws InterruptedException {
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  //Login credentials
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();	  
  }
}