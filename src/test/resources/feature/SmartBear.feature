Feature:
  # TC#4: SmartBear order process
  #1. User is logged into SmartBear Tester account and on Order page
  #2. User fills out the form as followed:
  #3. User selects FamilyAlbum from product dropdown
  #4. User enters 4 to quantity
  #5. User enters John Wick to costumer name
  #6. User enters Kinzie Ave to street
  #7. User enters Chicago to city
  #8. User enters IL to state
  #9. User enters 60056
  #10. User selects Visa as card type
  #11. User enters 1111222233334444 to card number
  #12. User enters 12/22 to expiration date
  #13. User clicks process button
  #14. User verifies John Wick is in the list
  #
  #Note: Follow POM, and solution should be done using Cucumber
  #parameterization
  #
  #
  #URL:
  #"http://secure.smartbearsoftware.com/samples/testcomple
  #te12/WebOrders/login.aspx"
  #
  #userName="Tester"
  #
  #password="test"
  #

  @smartBear
  Scenario Outline: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
    When User selects "<product type>" from product dropdown
    * User enters "<quantity>" to quantity
    * User enters "<name>" to costumer name
    * User enters "<street>"
    * User enters "<city>" to city
    * User enters "<state>" to state
    * User enters "<zip>" zip
    * User selects "<card type>" as card type
    * User enters "<card number>" to card number
    * User enters "<expiration date>" to expiration date
    * User clicks process button
    Then User verifies "<name>" is in the list
    Examples:
      | product type | quantity | name          | street               | city          | state | zip   | card type        | card number      | expiration date |
      | FamilyAlbum  | 1        | John Wick     | Kinzie Ave to street | Chicago       | IL    | 60056 | Visa             | 1111222233334444 | 12/22           |
      | MyMoney      | 2        | Steve Jobs    | 45, Stone st.        | Las Vegas     | NV    | 58453 | MasterCard       | 770077007700     | 07/10           |
      | ScreenSaver  | 3        | Justin Bieber | Milltown             | Salmon Island | CA    | 12345 | American Express | 999888777888     | 06/08           |
      | MyMoney      | 4        | James Bond    | Greentown            | Bringtone     | TX    | 56436 | Visa             | 770000770000     | 03/09           |





