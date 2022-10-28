Feature: Web table Application Cydeo

  @wip
  Scenario: Positive login scenario
    Given go to: Web table Application webpage
    When enter username "Test"
    And enter password "Tester"
    And click to login button
    Then verify URL should end with "orders"

