@CHROME
Feature: Login to HP Webtour and Pass the information to another application using Chrome browser
@EXecution_Set1
  Scenario Outline:F1_Scenario1
  
  Given I  Login Application_First with username as "<username>" and password as "<password>" and URL as "<URLFirst>"
     
  When I click login button for application_First
    
  And I signout from application_First
    
  Then I pass the info from Application_first to next Application with URL "<URLSecond>"
  Examples:
  
     |username                |password   |URLFirst                                     |URLSecond      |
     |priyajithzraxx@gmail.com|Priya123456|http://newtours.demoaut.com/mercurysignon.php|https://www.google.com |
     
  