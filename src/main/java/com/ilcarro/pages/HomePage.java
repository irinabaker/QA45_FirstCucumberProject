package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1:nth-child(1)")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {

        assert isElementVisible(homePageTitle);
        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = ".positive-button.ng-star-inserted")
    WebElement okButton;

    public HomePage clickOnOK() {
        click(okButton);
        return this;
    }

    @FindBy(css = "h2.message")
    WebElement dialogMessage;

    public HomePage verifyMessage(String message) {
        assert shouldHaveText(dialogMessage,message,10);
        return this;
    }
}
