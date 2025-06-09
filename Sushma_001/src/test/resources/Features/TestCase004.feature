Feature: Create Skills Records Automatiom in orange hrm

  Background: Common Steps
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: TC01- Add Skill Records Using Data Tables without Headers
    And User Logins with valid Credentials Using Data Tables without Headers
      | Admin | admin123 |
    Then Navigate to Skills Page
    When Add Skill Records Using Data Tables without Headers
      | Selenium With Java    | Having 3 years of Exp |
      | Slelenium With Python | Having 2 years of Exp |
      | Tosca                 | Having 5 years of Exp |
      | API Testing           | Having 3 years of Exp |
    When Click on Logout Button
    Then Close the Browser