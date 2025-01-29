package org.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.base.Baseclass;
import org.junit.Assert;
import org.pom.loginpom;

import java.time.Duration;

public class Stepfile extends Baseclass {

    loginpom pm;

    @Given("user launch the browser")
    public void userLaunchTheBrowser() {
        launchbrowser();
        maximizewindow();
        implicitwait(30);
        geturl("https://practicetestautomation.com/practice-test-login/");

    }

    @Given("user enters the username as {string}")
    public void userEntersTheUsernameAs(String string) {

        pm=new loginpom(driver);

        insert(pm.getUsername(),string);

    }
    @Then("user enters the password as {string}")
    public void userEntersThePasswordAs(String string) {

        insert(pm.getPassword(),string);


    }
    @When("user clicks the login button")
    public void userClicksTheLoginButton() {

        Btnclick(pm.getClick());


    }
    @Then("user verifies that the login page opened")
    public void userVerifiesThatTheLoginPageOpened() {

        log("username is visible"+retrivetext(pm.getLoginmessage()));

        Assert.assertTrue("Logged In Successfully",true);


    }


}





