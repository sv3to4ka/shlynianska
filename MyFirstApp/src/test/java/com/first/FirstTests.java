package com.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTests {
    private WebDriver driver;

    @BeforeClass
    private void setUp() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void openHomePage() {
        driver.get("http://www.amazon.com");
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test
    private void test() {
        //TODO
    }

}
