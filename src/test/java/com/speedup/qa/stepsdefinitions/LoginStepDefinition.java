package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.models.CredentialsData;
import com.speedup.qa.questions.Login;
import com.speedup.qa.task.LoginUser;
import com.speedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Miguel Hugo");
    }

    @Given("^enter the portal Linkedin$")
    public void enterThePortalLinkedin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^enter the username and password$")
    public void enterTheUsernameAndPassword(List<CredentialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withTheData(data.get(0)));
    }

    @Then("^will enter the web already with the user (.*)$")
    public void willEnterTheWebAlreadyWithTheUser(String nameUser) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Login.message(), org.hamcrest.Matchers.is(nameUser)));
    }

}