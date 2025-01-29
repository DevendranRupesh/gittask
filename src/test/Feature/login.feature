Feature: Test Automation for Swaglabs loginpage

  Scenario:login should pass and navigate to next page

    Given user launch the browser
    And   user enters the username as "student"
    Then  user enters the password as "Password123"
    When  user clicks the login button
    Then  user verifies that the login page opened




