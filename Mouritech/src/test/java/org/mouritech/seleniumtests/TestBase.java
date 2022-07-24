package org.mouritech.seleniumtests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver = null;
    @BeforeSuite
    public void initialize() throws IOException{
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
//To maximize browser
        driver.manage().window().maximize();

//To open facebook
        driver.get("https://www.wikipedia.org/");
    }
    @AfterSuite
//Test cleanup
    public void TeardownTest()
    {
        TestBase.driver.quit();
    }

}