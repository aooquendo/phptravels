Feature: Add founds
  As a user i want to add founds to buy travels

  Scenario: Add founds succes
    Given i want to add founds to my account i login to the system
    When  i type my user "user@phptravels.com"
    And   i type my password "demouser" in the password box
    And   i click on the login button
    And   i should see the main menu and select the add found option in the menu
    And   i choose the pay bank transfer option
    And   i select pay now option
    Then  i should see an electronic bill with the name back " Western Bank CBP"