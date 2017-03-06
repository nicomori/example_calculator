@Regression @Case_2A
Feature: Interview Nicolas Mori

Scenario Outline: Get a random user (userID) , print its address to output and verify email format is correct

Given the url "<url>" and the database "<db>"
And Get a random user userID print its address to output
And verify email format is correct

Examples:
| url		   		 		 | db 	| 
| http://localhost:3000/	 | post | 