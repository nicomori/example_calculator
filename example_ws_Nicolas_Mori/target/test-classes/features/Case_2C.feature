@Regression @Case_2C
Feature: Interview Nicolas Mori

Scenario Outline: Do a post using same userID with a valid title and body

Given the url "<url>" and the database "<db>"
And Do a post using same userID with a valid title "<title>" and body "<body>"

Examples:
| url		   		 		 | db 	| title				| body			 | 
| http://localhost:3000/	 | post | a new title3333	| a new body2222 | 
