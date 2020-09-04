@F
  Feature: Google search
    Scenario: user search for google search
      Given user on the google page
      And user searches for iphone
      Then verify user example  has iphone
