package STEPS2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.HomePage;
import PAGES.LoginPage;
import PAGES.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	HomePage hp = new HomePage();
	LoginPage lp= new LoginPage();
	SkillsPage sp= new SkillsPage();	

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
			lp.LoginPage1(driver);
			lp.Login_Scenario(USERNAME, PASSWORD);
	}

	@Then("Click On LoginButton")
	public void click_on_login_button() throws InterruptedException {
		
		lp.LoginPage1(driver);
		lp.Login_Button();
		
	}

	@Then("Navigate to Skills Page")
	public void navigate_to_skills_page() {
		
		hp.HomePage1(driver);
		hp.Navigate_SkillsPage();
			
	}

	@When("Add Skill Record as {string} and {string}")
	public void add_skill_record_as_and(String SKILLNAME, String SKILLDESCR) {
		
		sp.SkillsPage1(driver);
		sp.Add_SkillRecords_Scenario(SKILLNAME, SKILLDESCR);			
	}

	@When("Click on Logout Button")
	public void click_on_logout_button() {
		
		hp.HomePage1(driver);
		hp.Logout();		
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		
		hp.HomePage1(driver);
		hp.Close_Browser();		
	}
	
	
	@When("User Logins with valid Credentials Using Data Tables without Headers")
	public void user_logins_with_valid_credentials_using_data_tables_without_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 
		lp.LoginPage1(driver);
		lp.Login_Without_Header(dataTable);		
	}
	
	@When("Add Skill Records Using Data Tables without Headers")
	public void add_skill_records_using_data_tables_without_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
		sp.SkillsPage1(driver);
		sp.Add_SkillRecords_Without_Header(dataTable);		
	}
	
	@When("User Logins with valid Credentials Using Data Tables with Headers")
	public void user_logins_with_valid_credentials_using_data_tables_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			
			lp.LoginPage1(driver);
			lp.Login_With_Header(dataTable);
		
	}
		
	@When("Add Skill Records Using Data Tables with Headers")
	public void add_skill_records_using_data_tables_with_headers(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
		sp.SkillsPage1(driver);
		sp.Add_SkillRecords_With_Header(dataTable);
		
	}

}
