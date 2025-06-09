package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
	
	WebDriver driver;
	
	public void SkillsPage1(WebDriver driver3)
	{
		this.driver= driver3;
	}
	
	public void Add_SkillRecords_Scenario(String SKILLNAME, String SKILLDESCR) {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SKILLNAME);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SKILLDESCR);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
	
	public void Add_SkillRecords_Without_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<List<String>>SKillRecords = dataTable.cells();
		
		for (int i=0;i<SKillRecords.size();i++)
		{
			String SKILLNAME1= SKillRecords.get(i).get(0); //CELL(0,0)
					
			String SKILLDESCR1= SKillRecords.get(i).get(1); // ceell(0,1)
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SKILLNAME1);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SKILLDESCR1);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
		}
	}
	
	public void Add_SkillRecords_With_Header(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		   
		List<Map<String, String>> SkillsTable = dataTable.asMaps(String.class, String.class);
		
		for (int i=0; i<SkillsTable.size();i++ )
		{
			String SkillName = SkillsTable .get(i).get("SkillNAME");
			String SkillDescr = SkillsTable.get(i).get("SKILLdescr");
			
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName);
			driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SkillDescr);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
		}
	}

}
