
Feature: Wikipedia search functionality and verification

  Background:
    Given User is on Wikipedia home page

  Scenario Outline: Wikipedia Search Functionality Title Verification
    When User types "<Search Value>" in the wiki search box
    And User clicks wiki search button
    Then User see "<Expected title>" is in the wiki title
    Examples:
      | Search Value  | Expected title |
      | Steve Jobs    | Steve Jobs     |
      | Justin Bieber | Justin Bieber  |
      | Adam Levine   | Adam Levine    |

  Scenario Outline: Wikipedia Search Functionality Header Verification
    When User types "<Search Value>" in the wiki search box
    And User clicks wiki search button
    Then User see "<Expected title>" is in the main header
    Examples:
      | Search Value  | Expected title |
      | Steve Jobs    | Steve Jobs     |
      | Justin Bieber | Justin Bieber  |
      | Adam Levine   | Adam Levine    |

  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    When User types "<Search Value>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<Expected title>" is in the image header
    Examples:
      | Search Value  | Expected title |
      | Steve Jobs    | Steve Jobs     |
      | Justin Bieber | Justin Bieber  |
      | Adam Levine   | Adam Levine    |







