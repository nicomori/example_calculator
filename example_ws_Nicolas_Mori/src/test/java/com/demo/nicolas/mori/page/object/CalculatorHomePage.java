package com.demo.nicolas.mori.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.nicolas.mori.framework.ParentPage;

public class CalculatorHomePage extends ParentPage {

	public CalculatorHomePage(WebDriver driver) {
		super(driver);
	}

	By BUTTON_1 = By.xpath("//android.view.ViewGroup[1]/android.widget.Button[7]");
	By BUTTON_2 = By.xpath("//android.view.ViewGroup[1]/android.widget.Button[8]");
	By BUTTON_3 = By.xpath("//android.view.ViewGroup[1]/android.widget.Button[9]");
	By BUTTON_4 = By.xpath("(//android.view.ViewGroup[1]/android.widget.Button[4])[2]");
	By BUTTON_5 = By.xpath("//android.view.ViewGroup[1]/android.widget.Button[5]");
	By BUTTON_6 = By.xpath("//android.view.ViewGroup[1]/android.widget.Button[6]");
	By BUTTON_7 = By.xpath("(//android.view.ViewGroup[1]/android.widget.Button[1])[2]");
	By BUTTON_8 = By.xpath("(//android.view.ViewGroup[1]/android.widget.Button[2])[2]");
	By BUTTON_9 = By.xpath("(//android.view.ViewGroup[1]/android.widget.Button[3])[2]");
	By BUTTON_0 = By.xpath("(//android.view.ViewGroup[1]/android.widget.Button[11])[1]");

	By BUTTON_SYMBOL_PLUS = By.xpath("//android.view.ViewGroup[2]/android.widget.Button[5]");
	By BUTTON_SYMBOL_MINUS = By.xpath("//android.view.ViewGroup[2]/android.widget.Button[4]");
	By BUTTON_SYMBOL_MULTIPLICATION = By.xpath("//android.view.ViewGroup[2]/android.widget.Button[3]");
	By BUTTON_SYMBOL_DIVISION = By.xpath("//android.view.ViewGroup[2]/android.widget.Button[2]");
	By BUTTON_SYMBOL_EQUAL = By.xpath("//android.view.ViewGroup[1]/android.widget.ImageButton[1]");

	By FIELD_RESULT = By.xpath("//android.widget.EditText[1]");

	/**
	 * this method get the result of the calculator.
	 * 
	 * @return a integer value with the result of the caclulator.
	 */
	public int getResult() {
		return Integer.parseInt(getTextByLocator(FIELD_RESULT).replace(".", ""));
	}

	/**
	 * this method make click in the symbol declared in the feature file.
	 * 
	 * @param symbol
	 *            to press.
	 */
	public void pressInTheSymbol(String symbol) {
		switch (symbol) {
		case "+":
			click(BUTTON_SYMBOL_PLUS);
			break;
		case "-":
			click(BUTTON_SYMBOL_MINUS);
			break;
		case "*":
			click(BUTTON_SYMBOL_MULTIPLICATION);
			break;
		case "/":
			click(BUTTON_SYMBOL_DIVISION);
			break;
		case "=":
			click(BUTTON_SYMBOL_EQUAL);
			break;
		default:
			click(BUTTON_SYMBOL_EQUAL);
			break;
		}
	}

	/**
	 * this method make click in numbers to make the calulation, and make a
	 * iteration per all the characters inside in the value.
	 * 
	 * @param locator
	 */
	public void pressInTheNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			switch (Integer.parseInt(number.substring(i, i + 1))) {
			case 1:
				click(BUTTON_1);
				break;
			case 2:
				click(BUTTON_2);
				break;
			case 3:
				click(BUTTON_3);
				break;
			case 4:
				click(BUTTON_4);
				break;
			case 5:
				click(BUTTON_5);
				break;
			case 6:
				click(BUTTON_6);
				break;
			case 7:
				click(BUTTON_7);
				break;
			case 8:
				click(BUTTON_8);
				break;
			case 9:
				click(BUTTON_9);
				break;
			case 0:
				click(BUTTON_0);
				break;
			default:
				click(BUTTON_0);
				;
				break;
			}
		}
	}

}
