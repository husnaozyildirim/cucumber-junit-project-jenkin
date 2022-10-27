Feature:

  Background:
    Given User is on https:www.etsy.com

  Scenario: verify etsy title
    Then User sees title is as expected



    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      When User types Wooden Spoon in the search box
      And User clicks search button
      Then User sees Wooden Spoon is in the title

@wip
Scenario: Etsy Search Functionality Title Verification (with parameterization)
  When User types "Wooden Spoon" in the search box
  And User clicks search button
  Then User sees "Wooden spoon" is in the title


