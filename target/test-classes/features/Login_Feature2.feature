#Author:
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenI signout from applicationarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
@EXecution_Set2
Feature: Login to HP Webtour and Pass the information to another application using Chrome browser
  

  @FIREFOX
  Scenario Outline: F2_Scenario
  
  Given I  Login Application_Second with username as "<username>" and password as "<password>" and URL as "<URLFirst>"in browser "<browser>" and node "<node>"
     
  When I click login button for application2 
    
  And I signout from application2
    
  Then I pass the info to next Application2 with URL "<URLSecond>"in browser "<browser>" and node "<node>"

  Examples:
  
     |username                |password   | URLFirst                                    |URLSecond                 |browser|node|
     |priyajithzraxx@gmail.com|Priya123456|http://newtours.demoaut.com/mercurysignon.php|https://www.ultimatix.net |FIREFOX|5555|
     
  