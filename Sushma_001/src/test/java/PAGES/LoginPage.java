package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void LoginPage1(WebDriver driver1)
	{
		this.driver= driver1;
	}
	
	public void Login_Scenario(String USERNAME, String PASSWORD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);	
	}
	
	public void Login_Button() throws InterruptedException {
		
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	
	
	public void Login_Without_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		 
		String USERNAME1= dataTable.cell(0, 0);
		String PASSWORD1= dataTable.cell(0, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);		
	}
	
	public void Login_With_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> LoginData = dataTable.asMaps(String.class, String.class);
	   
		String USERNAME2 = LoginData.get(0).get("UseRNamE");
		String PASSWORD2 = LoginData.get(0).get("PasSWorD");
		
		driver.findElement(By.name("username")).sendKeys(USERNAME2);
		driver.findElement(By.name("password")).sendKeys(PASSWORD2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

}
