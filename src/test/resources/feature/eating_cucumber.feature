Feature: Eating too many cucumber may not be good for you
  user story: Eating too much of any thing may not be good for you

  @eating @smoke
  Scenario: Eating a few is no problem
    Given John is hungry
    When he eats some cucumbers
    Then he will be full