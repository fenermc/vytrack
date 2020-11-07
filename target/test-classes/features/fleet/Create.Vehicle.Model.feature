@new_vehicle_model
Feature: As user, I want to be able to create a vehicle model


  Scenario:  Add some new vehicle model
    Given user is on the login page
    And user logs in as a "store manager"
    And user navigates to "Fleet" and "Vehicles Model"
    And user clicks on create vehicle model button
    When user adds new create vehicles model
      | Model Name | Corolla |
      | Make       | 2021 |
    And user clicks on save and close button
    Then user verifies that new Vehicle model is displayed
      | Make       | 2021 |
      | Model Name | Corolla |


