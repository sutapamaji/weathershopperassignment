Feature:Complete the moisturizer/sunscreens shopping based on weather from weather shopper Website

  Scenario: WS-01 Verify user chooses the correct shopping option based on weather

    Given User landed to the weather shopper home page and checks the temperature
    When user chooses the respective shopping option based on weather and clicks on buy
    Then verify click should redirect to respective moisturizers and sunscreens page
    #Both the condition covered in the definition (moisturizers and sunscreens)

  Scenario: WS-02 Add moisturizer/sunscreens based on condition and move to the checkout page

    Given User added two least expensive product in the card based on requirement
    And user verifies two item should be added in the cart clicks on cart button
    Then Verify page should redirect to checkout page successfully
    #User adding both moisturizers and sunscreens based on requirement covered in the code

  Scenario: WS-03 Verify the shopping cart and complete the payment

    Given User landed to the checkout page and verify the items in the cart clicks on Pay with card option
    When user provides all the required payment details clicks on Pay button
    Then Verify payment page once payment done successfully
    #End to End scenario cover here independently
