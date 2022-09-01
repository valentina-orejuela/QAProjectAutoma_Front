package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class LoginStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Valentina");
    }

    @Given("^enter the portal Linkedin$")
    public void enterThePortalLinkedin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }

    @When("^enter the username and password$")
    public void enterTheUsernameAndPassword() {

    }

    @Then("^will enter the web already with the user$")
    public void willEnterTheWebAlreadyWithTheUser() {

    }
}