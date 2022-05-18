Feature: SignUp
  As a web user i want to get an account

  Scenario: SignuP Success
    Given i want to get an Acount
    When i type my name "Michael"
    And i type my last name "De santa"
    And i type my number phone 90012332
    And i type my email "michael@mail.com"
    And i type my new password "santa123"
    Then i should get my new account after i clicked the signup button