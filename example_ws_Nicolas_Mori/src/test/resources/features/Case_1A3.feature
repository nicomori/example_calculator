@Regression @Case_1A3
Feature: Interview Nicolas Mori

Scenario Outline: Get a random user (userID) , print its address to output and verify email format is correct

Given I start the android native calculator with this device "<device uuid>"
And access the number "<first number>"
And press the symbol "<symbol>"
And access the number "<second number>"
And press the symbol "<equal>"
Then show the result per console

Examples:
| device uuid    					| first number 	| second number | symbol | equal |
| 266DE50BB1144087B603D03CE45E7C37 	| 23031981		| 22323			| -		 | =	 |
