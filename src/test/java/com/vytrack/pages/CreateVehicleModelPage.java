package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateVehicleModelPage extends BasePage{

    @FindBy( xpath = "//a[contains(@title,'Create Vehicles Model')]")
    private WebElement createVehicleModelBtn;

    @FindBy(xpath = "//input[contains(@id, 'custom_entity_type_ModelName-uid-')]")
    private WebElement modelNameInputBox;

    @FindBy(xpath = "//input[@data-name='field__make']")
    private WebElement makeInputBox;

    public void clickCreateVehicleModelBtn(){

        BrowserUtils.clickOnElement(createVehicleModelBtn);
    }

    public void enterModelName(String text) {
        BrowserUtils.enterText(modelNameInputBox, text);
    }

    public void enterMake(String text) {
        BrowserUtils.enterText(makeInputBox, text);
    }


    public String getDataFromGeneralInformation(String parameter) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        String xpath = "//label[text()='" + parameter + "']/../div/div";
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return element.getText().trim();
        //this Xpath helps us to find  value of every parameter inside of general page

    }

    //      "//label[text()='" + parameterName + "']/../div/div"
}
