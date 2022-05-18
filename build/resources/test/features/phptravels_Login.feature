Feature: Login
  As a web user i want to login to the system

  Scenario: login success
  Given that i want to logint to the system
  When i type my username "user@phptravels.com"
  And i type my password "demouser"
  Then i should see the main menu after i clicked the login button