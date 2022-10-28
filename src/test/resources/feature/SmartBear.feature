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
  Scenario: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
    When User selects "FamilyAlbum" from product dropdown
    * User enters "4" to quantity
    * User enters "John Wick" to costumer name
    * User enters "Kinzie Ave to street"
    * User enters "Chicago" to city
    * User enters "IL" to state
    * User enters "60056" zip
    * User selects "Visa" as card type
    * User enters "1111222233334444" to card number
    * User enters "12/22" to expiration date
    * User clicks process button
    Then User verifies John Wick is in the list


