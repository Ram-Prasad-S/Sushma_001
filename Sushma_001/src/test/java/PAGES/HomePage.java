package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public void HomePage1(WebDriver driver2)
	{
		this.driver= driver2;
	}
	
	
	public void Close_Browser() {
		System.out.println("Browser Closed");
		//driver.close();
		
	}
	
	public void Logout() {
		
		System.out.println("user Logged out");
		//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
	public void Navigate_SkillsPage() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();	
	}

}
