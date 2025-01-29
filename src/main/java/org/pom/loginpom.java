package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom {

    WebDriver driver;

    public loginpom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //@findby-- for single elements
    //@findbys -- for mutiple elements

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath ="//input[@name='password']")
    WebElement password;

    public WebElement getLoginmessage() {
        return loginmessage;
    }

    @FindBy(xpath = "//button[@id='submit']")
    WebElement click;

    @FindBy(xpath = "//h1[text()='Logged In Successfully']")
    WebElement loginmessage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getClick() {
        return click;
    }
}
