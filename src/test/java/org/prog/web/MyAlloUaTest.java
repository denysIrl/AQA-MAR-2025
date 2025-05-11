package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class MyAlloUaTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @Test
    public void alloUaTest() {
        driver.get("https://allo.ua/");
        WebElement searchInput = driver.findElement(By.id("search-form__input"));
        searchInput.sendKeys("Samsung Galaxy S21");
        searchInput.sendKeys(Keys.ENTER);
        System.out.println("We found Samsung Galaxy S21!");

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
