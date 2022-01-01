Feature: Login functionality of leaftaps application

Background:
    Given Open the chrome browser
    And Load the application URL

  Scenario: Login using valid credentials

    Given Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on login button
    Then Homepage is displayed

  Scenario: Login using invalid credentials
    
    
    Given Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfas'
    When Click on login button
    But Error message is displayed

  Scenario Outline: Login using valid credentials multiple data
    
    Given Enter the username as <username>
    And Enter the password as <password>
    When Click on login button
    Then Homepage is displayed

    Examples: 
      | username         | password |
      | 'Demosalesmanager' | 'crmsfa'   |
      | 'Democrm'          | 'crmsfa'   |
