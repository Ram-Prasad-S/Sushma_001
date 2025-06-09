Feature: Create Skills Records Automatiom in orange hrm
	
Background: Common Steps 
    Given User Launch Chrome Browser 
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC01- Particular Test Object
    And User Enters Usename as "Admin" and Password as "admin123"
    Then Click On LoginButton
    Then Navigate to Skills Page
    When Add Skill Record as "Java1234" and "Developer2"
    When Click on Logout Button
    Then Close the Browser