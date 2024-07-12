Feature: Log in

    Scenario: Student should be able to successfully login with valid credential
    Given Student at talentek homepage
    And Student enter valid e-mail address
    And Student enter valid password
    When they click on log in button
    Then Student should be able to successfully login

  Scenario: Student should not be able to successfully login with invalid e-mail
    Given Student at talentek homepage
    And Student enter invalid e-mail address
    And Student enter valid password
    When they click on log in button
    Then Student should not be able to successfully login with invalid e-mail


  Scenario: Student should not be able to successfully login with invalid password
    Given Student at talentek homepage
    And Student enter valid e-mail address
    And Student enter invalid password
    When they click on log in button
    Then Student should not be able to successfully login with invalid password

  Scenario: Student should not be able to successfully login with invalid credential
    Given Student at talentek homepage
    And Student enter invalid e-mail address
    And Student enter invalid password
    When they click on log in button
    Then Student should not be able to successfully login with invalid credential




