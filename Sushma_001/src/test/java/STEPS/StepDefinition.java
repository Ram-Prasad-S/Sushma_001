package STEPS;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String GivenURL) {
		driver.get(GivenURL);
		driver.manage().window().maximize();		
	}

	@When("User Enters Usename as {string} and Password as {string}")
	public void user_enters_usename_as_and_password_as(String USERNAME, String PASSWORD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);		
	}

	@Then("Click On LoginButton")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("Navigate to Skills Page")
	public void navigate_to_skills_page() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();	
	}

	@When("Add Skill Record as {string} and {string}")
	public void add_skill_record_as_and(String SKILLNAME, String SKILLDESCR) {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SKILLNAME);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(SKILLDESCR);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		System.out.println("user Logged out");
		//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		System.out.println("Browser Closed");
		//driver.close();	
		
	}
	
	
	@When("User Logins with valid Credentials Using Data Tables without Headers")
	public void user_logins_with_valid_credentials_using_data_tables_without_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 
		String USERNAME1= dataTable.cell(0, 0);
		String PASSWORD1= dataTable.cell(0, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(USERNAME1);
		driver.findElement(By.name("password")).sendKeys(PASSWORD1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		
		
	}
	@When("Add Skill Records Using Data Tables without Headers")
	public void add_skill_records_using_data_tables_without_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
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
		
		@When("User Logins with valid Credentials Using Data Tables with Headers")
		public void user_logins_with_valid_credentials_using_data_tables_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			
			List<Map<String, String>> LoginData = dataTable.asMaps(String.class, String.class);
		   
			String USERNAME2 = LoginData.get(0).get("UseRNamE");
			String PASSWORD2 = LoginData.get(0).get("PasSWorD");
			
			driver.findElement(By.name("username")).sendKeys(USERNAME2);
			driver.findElement(By.name("password")).sendKeys(PASSWORD2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
		
		}
		
		@When("Add Skill Records Using Data Tables with Headers")
		public void add_skill_records_using_data_tables_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		   
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
