#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  Login With Scenario Outline

  @tag1
  Scenario Outline: Login with scenario outline
    Given I Navigate to login page
    When I login with email adress "<email>" and password "<password>"
    Then I should arrive at My account page

    Examples: 
      | email  							| password			|
      | abab@abab.com				| abab123 			|
      | jamesbond@test.com 	| 1231243114  	| 
      
      