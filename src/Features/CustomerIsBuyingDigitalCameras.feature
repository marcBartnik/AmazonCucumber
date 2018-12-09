@smokeTest

Feature: CustomerIsBuyingDigitalCamerasFeature
    This feature deals with looking for digital cameras and putting them to cart

    Scenario: Verify if Amazon Customer is able to search for specific digital cameras and add them to the cart
      Given Customer is on Amazon home page
      When Customer goes into "Best sellers in Digital Cameras"
      When Customer opens details of fifth product
      When Customer adds eight pieces to the shopping cart
      When Customer checks that correct product was added
      Then Customer checks that subtotal price sum is correct