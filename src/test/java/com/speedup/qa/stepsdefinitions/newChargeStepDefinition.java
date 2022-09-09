package com.speedup.qa.stepsdefinitions;

import com.speedup.qa.task.NewCharge;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class newChargeStepDefinition {

    @When("^Add the new job$")
    public void addTheNewJob() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewCharge.newCharger());

    }

    @Then("^I should see in the profile$")
    public void iShouldSeeInTheProfile() {

    }
}
