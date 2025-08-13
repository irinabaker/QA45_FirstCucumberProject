package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarPage extends BasePage{

    public CarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement letTheCarWork;

    public CarPage clickOnLetCarLink() {
        pause(500);
        click(letTheCarWork);
        return this;
    }

    @FindBy(id = "pickUpPlace")
    WebElement pickUpPlace;
    @FindBy(id = "make")
    WebElement make;
    @FindBy(id = "model")
    WebElement model;
    @FindBy(id = "year")
    WebElement year;
    @FindBy(id = "fuel")
    WebElement fuel;
    @FindBy(id = "seats")
    WebElement seats;
    @FindBy(id = "class")
    WebElement carClass;
    @FindBy(id = "serialNumber")
    WebElement serialNumber;
    @FindBy(id = "price")
    WebElement price;

    public CarPage enterCarData() {
       // addLocation(pickUpPlace,"Haifa, Israel");
        type(make,"Audi");
        type(model,"A7");
        type(year,"2024");
        selectFuel(fuel,"Diesel");
        type(seats,"5");
        type(carClass,"Limousin");
        type(serialNumber,"123456761");
        type(price,"500");
        return this;
    }

    private void selectFuel(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }

    private void addLocation(WebElement element, String city) {
        element.sendKeys(city);
        pause(1000);
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.ENTER);
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;

    public CarPage clickOnSubmit() {
        click(submitButton);
        return this;
    }
}
