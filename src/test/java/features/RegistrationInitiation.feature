Feature: Initiation of the registration process using valid email address.

  @test
  Scenario: Visitor initiate registration process by valid email address
    Given a visitor
    When open the Sign in page
    And type valid email address to the email address field
    And click on Create an account button
    Then registration process is initiated