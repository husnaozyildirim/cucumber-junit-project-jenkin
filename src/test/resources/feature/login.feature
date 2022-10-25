@smoke @Regression
Feature:
  User story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed.
  Accounts are: librarian, student, admin

  @smoke @librarian @employee
  Scenario: Login as a librarian
    Given User is on the library login page
    When User enters librarian username
    And User enters librarian password
    Then User should see dashboard

    @student
Scenario: Login as a student
  Given User is on the library login page
  When User enters student username
  And User enters student password
  Then User should see dashboard