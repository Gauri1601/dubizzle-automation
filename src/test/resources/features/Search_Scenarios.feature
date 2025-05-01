Feature: Car Search on Dubizzle

  Scenario Outline: Search for cars on Dubizzle
    Given I launch the Chrome browser
    When I open the Dubizzle cars page
    And I search for "<CarName>"
    Then I should see search results related to "<CarName>"

    Examples:
      | CarName          |
      | Dodge Challenger |
     
# Scenario Outline: Search for bikes on Dubizzle
  #   Given I launch the Chrome browser
  #   When I open the Dubizzle page
  #   And I search for "<BikeName>"
  #   Then I should see search results related to "<BikeName>"
  #
  #   Examples:
  #     | BikeName       |
  #     | Royal Enfield  |