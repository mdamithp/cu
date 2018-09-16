@tag
Feature: Test google search

  @tag1
  Scenario: google search
    Given I navigate to google home page
    When I type "testing" on the search box
    Then I will be able to see the test result
