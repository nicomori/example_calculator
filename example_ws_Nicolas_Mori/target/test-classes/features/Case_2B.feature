@Regression @Case_2B
Feature: interview Nicolas Mori

Scenario Outline: Using userID Get their associated posts and verify they contains a valid id, title and body

Given the url "<url>" and the database "<db>"
And Using userID "<userId>" Get their associated posts
And verify they contains a valid id, title and body

Examples:
| url		   		 		 | db 	| userId | 
| http://localhost:3000/	 | post | 	5	 | 
