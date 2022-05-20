Feature: SigUp an Agent account
  As a web user i want to get an Angent account on phptravels

  Scenario: SignUp agent account succes
    Given that i want to get an aggent account on phptravels
    When  i type my agent name "agent"
    And   i type my agent last name "orange"
    And   i type my agent number phone "180054"
    And   i type my agent email "agent@email.com"
    And   i type my agent password "hola123"
    And   i select my account type
    Then  i press the sigup button i should get my agent account