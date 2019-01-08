@ABC
Feature: To check Positive and Negative numbers

  @positiveCheck
  Scenario: Check the number is positive
    When User enter the first number
     And User enter the second number
    Then User check the two numbers for positive test
     And Print the pos

  @negativeCheck
  Scenario: Check the number is negative
    When User enter the first number
     And User enter the second number
    Then User check the two numbers for negative test
     And Print the neg     