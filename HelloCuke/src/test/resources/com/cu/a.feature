Feature: Hello World

  Scenario: hello world msg
    Given I say Viky
    Then I should get message Hello Viky
    
  Scenario: Basic Google Search
  	Given I open Google.com
  	When I search 'java 8'
  	Then I should see the 'java 8' search results
