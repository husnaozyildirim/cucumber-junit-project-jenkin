Feature:
  @wip
  Scenario:
    Given go to Hioscar page
    When click search network
    And From Coverage year dropdown Select 2023 option
    * From Coverage access dropdown Select "Employer-provided" option
    * From Network partner dropdown Select "Oscar" option
    * From Coverage area dropdown Select New Jersey
    * Click Continue button
    Then Verify title contains "Oscar"

