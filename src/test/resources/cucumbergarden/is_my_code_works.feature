#Author: csabe812
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
Feature: I would like to check my code that I have written

  @tag1
  Scenario Outline: gezakekazeg is palindrome and trtrzhztrfvf not
    When I write "<notapalindrome>"
    Then It should be "<resfalse>"
    When I change my mind and write "<apalindrome>"
    Then It should be correctly "<restrue>"
    
  Examples:
    | notapalindrome | resfalse | apalindrome | restrue |
    | trtrzhztrfvf |false | gezakekazeg | true |
    
