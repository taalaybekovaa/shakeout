package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.HTML;

public class HomePage {

public HomePage (WebDriver driver) {PageFactory.initElements(driver, this);}

   @FindBy (className = "mc-red-button")
    private WebElement allServicesButton;

@FindBy(tagName = "//h1")
private WebElement header;

public void clickOnAllServiesButton(){
    allServicesButton.click();
}
}
