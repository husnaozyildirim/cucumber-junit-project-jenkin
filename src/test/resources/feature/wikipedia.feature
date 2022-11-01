Feature: Wikipedia search functionality and verification


  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<Search Value>" in the wiki search box
    And User clicks wiki search button
    Then User see "<Expected>" is in the wiki title
    Then User see "<Expected>" is in the main header
    Then User sees "<Expected>" is in the image header
    Examples:
      | Search Value  | Expected      |
      | Steve Jobs    | Steve Jobs    |
      | Justin Bieber | Justin Bieber |
      | Adam Levine   | Adam Levine   |









