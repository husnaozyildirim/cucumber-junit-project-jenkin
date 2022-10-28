Feature: Wikipedia search functionality and verification

  Background:
    Given User is on Wikipedia home page

  Scenario Outline: Wikipedia Search Functionality Title Verification
    When User types "<text>" in the wiki search box
    And User clicks wiki search button
    Then User see "<text>" is in the wiki title
    Examples:
      | text          |
      | Steve Jobs    |
      | Justin Bieber |
      | Adam Levine   |


  Scenario Outline: Wikipedia Search Functionality Header Verification
    When User types "<text>" in the wiki search box
    And User clicks wiki search button
    Then User see "<text>" is in the main header
    Examples:
      | text          |
      | Steve Jobs    |
      | Justin Bieber |
      | Adam Levine   |

  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    When User types "<text>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<text>" is in the image header
    Examples:
      | text          |
      | Steve Jobs    |
      | Justin Bieber |
      | Adam Levine   |







