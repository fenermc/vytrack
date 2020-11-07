package com.vytrack.step_definitions;

import com.vytrack.pages.CreateVehicleModelPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CreateVehicleModelDefinitions {

    CreateVehicleModelPage createVehicleModelPage = new CreateVehicleModelPage();

    @And("user clicks on create vehicle model button")
    public void userClicksOnCreateVehicleModelButton() {
        BrowserUtils.wait(10);
        createVehicleModelPage.clickCreateVehicleModelBtn();

    }

    @When("user adds new create vehicles model")
    public void userAddsNewCreateVehiclesModel(Map<String, String> data) {

        String modelName = data.get("Model Name");
        String make = data.get("Make");

        createVehicleModelPage.enterMake(make);
        createVehicleModelPage.enterModelName(modelName);

    }

    @Then("user verifies that new Vehicle model is displayed")
    public void userVerifiesThatNewVehicleModelIsDisplayed(Map<String, String> data) {

        String modelName = data.get("Model Name");
        System.out.println(modelName);
        String make = data.get("Make");
        System.out.println(make);

        Assert.assertEquals(modelName, createVehicleModelPage.getDataFromGeneralInformation("Model Name"));
        Assert.assertEquals(make, createVehicleModelPage.getDataFromGeneralInformation("Make"));


        }
}
