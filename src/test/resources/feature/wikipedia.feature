Feature: Wikipedia search functionality and verification

@wip
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<text>" in the wiki search box
    And User clicks wiki search button
    Then User see "<text>" is in the wiki title
    Examples:
      | text          |
      | Steve Jobs    |
      | Justin Bieber |


