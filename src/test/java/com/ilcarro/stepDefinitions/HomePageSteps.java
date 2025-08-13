package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome Browser")
    public void launch_Chrome_Browser() {
        new HomePage(driver).launchesBrowser();
    }

    @When("User opens ilcarro Home Page")
    public void open_Home_Page() {
        new HomePage(driver).openUrl();
    }

    @Then("User verifies Home Page title is displayed")
    public void verify_Home_Page_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
}
