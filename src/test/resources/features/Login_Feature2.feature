@CHROME2
Feature: Login to HP Webtour and Pass the information to another application using Chrome browser
@EXecution_Set2
  Scenario Outline: F2_Scenario
  
  Given I  Login Application_Second with username as "<username>" and password as "<password>" and URL as "<URLFirst>"in browser "<browser>" and node "<node>"
     
  When I click login button for application2 
    
  And I signout from application2
    
  Then I pass the info to next Application2 with URL "<URLSecond>"in browser "<browser>" and node "<node>"

  Examples:
  
     |username                |password   | URLFirst                                    |URLSecond                 |browser|node|
     |priyajithzraxx@gmail.com|Priya123456|http://newtours.demoaut.com/mercurysignon.php|https://www.ultimatix.net |CHROME|5555|
     
  