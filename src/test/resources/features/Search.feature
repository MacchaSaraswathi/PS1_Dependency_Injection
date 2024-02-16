@tag
Feature: Search Functionality of Tricentis

@tag1
Scenario Outline: To test the Search Functionality of Tricentis Search bar
Given I am on the home page
When I type "Simple Computer" in search textbox
And I click on the search button
#Then should get result for {14.1}-Inch laptop

#Examples:
#|searchText      |
#|14.1-Inch laptop|
