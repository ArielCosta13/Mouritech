package org.mouritech.seleniumtests.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage {
    WebDriver driver;

    public ResultPage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.ID, using="firstHeading") WebElement articleTitle;


// Defining all the user actions (Methods) that can be performed in the wikipedia result page

    // Return the title of the article
    public String getTitle(){
        return articleTitle.getText();
    }



}

