package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.CarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on OK button")
    public void click_on_OK() {
        new HomePage(driver).clickOnOK();
    }

    @And("User clicks on Let the car work link")
    public void click_on_Let_car_link() {
        new CarPage(driver).clickOnLetCarLink();
    }

    @And("User enters cars valid data")
    public void enter_cars_valid_data() {
        new CarPage(driver).enterCarData();
    }

    @And("User clicks on Submit button")
    public void click_on_Submit() {
        new CarPage(driver).clickOnSubmit();
    }

    @Then("User verifies massage car was added")
    public void verify_massage_car_was_added() {
        new HomePage(driver).verifyMessage("added successful");
    }
}
