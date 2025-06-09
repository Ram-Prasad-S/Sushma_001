Feature: Create Skills Records Automatiom in orange hrm

  Background: Common Steps
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: TC01- Add Skill Records Using Data Tables with Headers
    And User Logins with valid Credentials Using Data Tables with Headers
      | UseRNamE | PasSWorD |
      | Admin    | admin123 |
    Then Navigate to Skills Page
    When Add Skill Records Using Data Tables with Headers
      | SkillNAME                | SKILLdescr            |
      | Selenium With Java123    | Having 3 years of Exp |
      | Slelenium With Python456 | Having 2 years of Exp |
      | Tosca123                 | Having 5 years of Exp |
      | API Testing 456          | Having 3 years of Exp |
    When Click on Logout Button
    Then Close the Browser
