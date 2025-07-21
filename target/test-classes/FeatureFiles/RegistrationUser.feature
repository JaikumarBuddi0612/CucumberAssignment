Feature: Registering a user in Para Bank

  Scenario Outline: Registering a user for a Para Bank account
    Given User is on the Para Bank website
    When User clicks the register link
    And User is redirected to the registration page
    And User enters their first name<first name>
    And User enters their last name<last name>
    And User enters their address<address>
    And User enters their city<city>
    And User enters their state<state>
    And User enters their zipcode<zipcode>
    And User enters their phone number<phone number>
    And User enters their ssn<SSN>
    And User enters their username<username>
    And User enters their password<password>
    And User confirms their password<confirm password>
    And User clicks the register button
    Then User is redirected to their profile
    Examples:
      | first name | last name | address     | city        | state       | zipcode  | phone number | SSN         | username   | password      | confirm password |
      | "Jaikumar" | "Buddi"   | "Hyderabad" | "Hyderabad" | "Telangana" | "500081" | "1234567890" | "123456789" | "Jai12345" | "Jaikumar123" | "Jaikumar123"    |
