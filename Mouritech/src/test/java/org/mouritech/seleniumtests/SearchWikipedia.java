package org.mouritech.seleniumtests;

import org.mouritech.seleniumtests.pages.ResultPage;
import org.mouritech.seleniumtests.pages.WikipediaSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchWikipedia extends TestBase{

    @Test
    public void search() throws Exception{
        WikipediaSearchPage searchPage = PageFactory.initElements(driver, WikipediaSearchPage.class);
        searchPage.writeSearch("Voyager 1");
        searchPage.clickSearchButton();
        ResultPage resultPage = PageFactory.initElements(driver, ResultPage.class);
        Assert.assertEquals (resultPage.getTitle(), "Voyager 1");
        Assert.assertTrue (driver.getCurrentUrl().contains("Voyager"));
    }
}