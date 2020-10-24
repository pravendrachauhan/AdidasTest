Feature: Search by keyword

  Scenario: Add to Cart Test 
    Given User is on the Demo Blaze home page
    When Navigate to "Laptops" → "Sony vaio i5"
    And click on "Add to cart"
    And Accept pop up confirmation
    When Navigate to "Laptops" → "Dell i7 8gb"
    And click on "Add to cart"
    And Accept pop up confirmation
    And click on "Cart"
    And Delete "Dell i7 8gb" from cart
    And click on "Place Order"
    And Fill in all web form fields
    And click on "Purchase"
    And Capture and log purchase Id and Amount
    Then Assert purchase amount equals expected
    And click on "OK"
