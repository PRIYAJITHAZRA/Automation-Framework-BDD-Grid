@CHROME
Feature: Login to HP Webtour and Pass the information to another application using Chrome browser
 @EXecution_Set4
  Scenario Outline:F4_Scenario4
  Given I  Login Application_Fourth with username as "<username>" and password as "<password>" and URL as "<URLFirst>"
  When I click login button for application_Fourth
    
  And I signout from application-Fourth
    
  Then I pass the info from Application_fourth to next Application with URL "<URLSecond>"
  Examples:
  
     |username                |password   | URLFirst                                    |URLSecond      |
     |priyajithzraxx@gmail.com|Priya123456|http://newtours.demoaut.com/mercurysignon.php|https://www.gmail.com |
     
  