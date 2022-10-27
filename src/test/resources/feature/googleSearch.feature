Feature: Google search functionality
  As a user, when I am on the google search page
  I should be able to search in search bar



  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types "words" in the google search box and clicks enter
    Then User sees "words – Google Search" is in the google title