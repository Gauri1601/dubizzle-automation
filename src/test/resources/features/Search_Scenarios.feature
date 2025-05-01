Feature: Car Search on Dubizzle

  Scenario Outline: Search for cars on Dubizzle
    Given I launch the Chrome browser
    When I open the Dubizzle cars page
    And I search for "<CarName>"
    Then I should see search results related to "<CarName>"

    Examples:
      | CarName          |
      | Dodge Challenger |
     