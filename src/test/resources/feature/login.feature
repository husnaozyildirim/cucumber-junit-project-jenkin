@smoke @Regression @login
Feature:
  User story:
  As a user, I should be able to login with correct credentials to different accounts and
  dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For the scenario in the feature file, user is expected to be on login page
    Given User is on the "user" login page
    When User enters "username" username
    And User enters "password" password
    Then User should see dashboard

  @smoke @librarian @employee
  Scenario: Login as a librarian

    @student @db
   Scenario: Login as a student

      @admin @employee @smoke
  Scenario: Login as a admin


