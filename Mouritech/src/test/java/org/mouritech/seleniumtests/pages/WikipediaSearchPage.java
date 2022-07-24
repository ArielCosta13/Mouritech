package org.mouritech.seleniumtests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikipediaSearchPage {
    WebDriver driver;

    public WikipediaSearchPage(WebDriver driver){
        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.ID, using="searchInput") WebElement searchField;
    @FindBy(how=How.XPATH, using="//*[@id=\"search-form\"]/fieldset/button") WebElement searchButton;

// Defining all the user actions (Methods) that can be performed in the Wikipedia home page

    // Write the string to search
    public void writeSearch(String search){
        searchField.sendKeys(search);
    }

    // This method to click on Search button
    public void clickSearchButton(){
        searchButton.click();
    }


}
