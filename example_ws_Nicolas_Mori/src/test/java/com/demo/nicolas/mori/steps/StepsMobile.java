package com.demo.nicolas.mori.steps;

import com.demo.nicolas.mori.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsMobile extends ParentScenario {
	@Given("I start the android native calculator with this device \"(.*)?\"")
	public void accessTheAndroid(String uuid) {
		startAndroid(uuid);
	}

	@And("press the symbol \"(.*)?\"")
	public void makeClickInTheSymbol(String symbol) {
		calculatorHomePage.pressInTheSymbol(symbol);
	}

	@And("access the number \"(.*)?\"")
	public void accessTheNumber(String number) {
		calculatorHomePage.pressInTheNumber(number);
	}

	@Then("show the result per console")
	public void getTheTotalInTheCalculator() {
		System.out.println("the result of the operation is " + calculatorHomePage.getResult());
	}
}