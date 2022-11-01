Feature: Web table Application Cydeo

Background:
  Given go to: Web table Application webpage


  Scenario: Positive login scenario
    Given go to: Web table Application webpage
    When enter username and password ang login
      | username | Test   |
      | password | Tester |
    Then verify URL should end with "orders"

  Scenario: Negative login scenario
    Given go to: Web table Application webpage
    When enter username and password ang login
      | username | QA   |
      | password | qa |
    Then verify URL should end with "orders"

@wip
  Scenario Outline: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects "<product type>" product type
    And user enters <quantity> quantity
    And user enters "<customer name>" customer name
    And user enters "<street>" street
    And user enters "<city>" city
    And user enters "<state>" state
    And user enters "<zipcode>" zipcode
    And user selects "<credit card type>" credit card type
    And user enters "<credit card number>" credit card number
    And user enters "<expiry date>" expiry date
    And user enters process order button
    Then user should see "<customer name>" in first row of the web table
    Examples:
      | product type | quantity | customer name   | street            | city    | state    | zipcode | credit card type | credit card number | expiry date |
      | Familybea    | 2        | Sherlock Holmes | 221B Baker Street | London  | England  | 50505   | American Express | 1111222233334444   | 12/23       |
      | MoneyCog     | 1        | Justine Bieber  | 123 Pine st       | Queen   | New York | 12345   | Visa             | 1111222233334444   | 09/25       |
      | Screenable   | 3        | Steve Jobs      | 456 orange St     | Chicago | IL       | 67890   | MasterCard       | 1111222233334444   | 11/24       |
