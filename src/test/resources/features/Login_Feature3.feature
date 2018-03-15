@CHROME3
Feature: Login to HP Webtour and Pass the information to another application
@EXecution_Set3
  Scenario Outline: F3_Scenario
  
  Given I  Login Application_Third with username as "<username>" and password as "<password>" and URL as "<URLFirst>"in browser "<browser>" and node "<node>"
     
  When I click login button for application3 
    
  And I signout from application3
    
  Then I pass the info to next Application3 with URL "<URLSecond>"in browser "<browser>" and node "<node>"
  Examples:
  
     |username                |password   | URLFirst                                    |URLSecond             |browser|node|
     |priyajithzraxx@gmail.com|Priya123456|http://newtours.demoaut.com/mercurysignon.php|http://www.flipkart.com |CHROME|5556|  
 