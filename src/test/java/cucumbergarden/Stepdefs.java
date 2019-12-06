package cucumbergarden;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

	private String probablyItShouldBeAPalindrome;

	@When("I write {string}")
	public void i_write(String string) {
		this.probablyItShouldBeAPalindrome = "trtrzhztrfvf";
	}

	@Then("It should be {string}")
	public void it_should_be(String string) {
		assertFalse(Boolean.parseBoolean(string));
	}

	@When("I change my mind and write {string}")
	public void i_change_my_mind_and_write(String string) {
		this.probablyItShouldBeAPalindrome = string;
	}

	@Then("It should be correctly {string}")
	public void it_should_be_correctly(String string) {
		assertTrue(Boolean.parseBoolean(string));
	}
}
