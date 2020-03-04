Feature: user should be able to register successfully

  @test
  Scenario: user should be able to register

    Given user is on home page
    When user click on register button
    And user enters registration details
    And user click on submit button
    Then user should see registration success message