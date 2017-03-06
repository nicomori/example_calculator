package com.demo.nicolas.mori.steps;

import java.util.Random;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import rest.Post;
import rest.client.GetJson;
import rest.client.UpdateJson;

public class StepsJSon {

	private String url;
	private String database;
	private Post post;

	private Random r = new Random();
	private int randomNumber = r.nextInt(20 - 1) + 1;

	@Given("the url \"(.*)?\" and the database \"(.*)?\"")
	public void accessTheBrowser(String urlGet, String databaseGet) {
		url = urlGet;
		database = databaseGet;
	}

	@And("Get a random user userID print its address to output")
	public void getARandomUser() throws Exception {
		post = GetJson.getRegister(url + database, randomNumber);
		System.out.println("This is the id: " + post.getId());
		System.out.println("This is the Email: " + post.getEmail());
		System.out.println("This is the title: " + post.getTitle());
		System.out.println("This is the body: " + post.getBody());
	}

	@And("verify email format is correct")
	public void validTheFormatInTheMail() {
		System.out.println("Starting to verify if the email format contains the symbol \"@\"");
		post.getEmail().contains("@");
		System.out.println("Starting to verify if the email format contains the String \".com\"");
		post.getEmail().contains(".com");
		System.out.println("All the validations are completed.");
	}

	@And("Using userID \"(.*)?\" Get their associated posts")
	public void getPostFromAUserId(String userId) throws Exception {
		post = GetJson.getRegister(url + database, Integer.parseInt(userId));
		System.out.println("Starting to get the data for this id " + userId);
		System.out.println("This is the id: " + post.getId());
		System.out.println("This is the Email: " + post.getEmail());
		System.out.println("This is the title: " + post.getTitle());
		System.out.println("This is the body: " + post.getBody());
	}

	@And("verify they contains a valid id, title and body")
	public void verifyContentIdTitleAndBody() {
		System.out.println("Starting to verify if the title contains a correct content");
		Assert.assertTrue(post.getTitle().length() > 0,
				"We are expecting receive a Title, in the title with the user ID: " + post.getUserId()
						+ " but we receive null");
		System.out.println("The verification of the title is completed, we find this content: " + post.getTitle());

		System.out.println("Starting to verify if the body contains a correct content");
		Assert.assertTrue(post.getBody().length() > 0, "We are expecting receive a body, in the body with the user ID: "
				+ post.getUserId() + " but we receive null");
		System.out.println("The verification of the body is completed, we find this content: " + post.getBody());
	}

	@And("Do a post using same userID with a valid title \"(.*)?\" and body \"(.*)?\"")
	public void doAPostInTheTitleAndBody(String newTitle, String newBody) throws Exception {
		post = GetJson.getRegister(url + database, randomNumber);
		System.out.println("Starting make a update in the register " + post.getId());
		UpdateJson.editARecordWithParameters(url + database, randomNumber, randomNumber, newTitle, newBody);
		System.out.println("The changes in the register " + post.getId() + " is completed.");
	}
}