Feature: Create Skills Records Automatiom in orange hrm
	
Background: Common Steps 
    Given User Launch Chrome Browser 
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario Outline: TC01- Particular Test Object
    And User Enters Usename as "Admin" and Password as "admin123"
    Then Click On LoginButton
    Then Navigate to Skills Page
    When Add Skill Record as <SkillName> and <SKillDescr>
    When Click on Logout Button
    Then Close the Browser
    
  Examples:
  |SkillName|SKillDescr|
  |"Java111"|"Java111descr"|
  |"Java222"|"Java222descr"|
  |"Java333"|"Java111descr"|
  |"Java444"|"Java222descr"|