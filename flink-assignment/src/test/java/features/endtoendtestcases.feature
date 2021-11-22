Feature:Complete the moisturizer shopping based on weather from weather shopper Website

  Scenario: WS-01 Verify user chooses the correct shopping option based on weather

    Given User landed to the weather shopper website
    When user checks the temperature
    And User shop for moisturizers if the weather is below 19 degrees
    And Shop for sunscreens if the weather is above 34 degrees
    Then User clicks on Buy moisturizer button
    Then verify click should redirect to moisturizer page

  Scenario: WS-02 Add moisturizer based on condition and move to the checkout page

    Given User selects the least expensive moisturizer that contains Aloe
    And User selects the least expensive moisturizer that contains almond
    When user verifies two item added in the cart
    Then User clicks on cart button
    And Verify page should redirect to checkout

  Scenario: WS-03 Verify the shopping cart and complete the payment

    Given User landed to the payment screen and verify the items in the cart
    And click on Pay with card option
    When user provides all the required payment details
    And click on Pay button
    Then Payment should successfully done
