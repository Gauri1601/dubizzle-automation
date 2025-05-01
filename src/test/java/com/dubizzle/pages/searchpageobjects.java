package com.dubizzle.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchpageobjects {
	WebDriver driver;

    public searchpageobjects(WebDriver driver) {
        this.driver = driver;
    }

    public void searchCar(String carName) {
       // driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys(carName, Keys.ENTER);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search for anything']")));
    	searchInput.sendKeys(carName, Keys.ENTER);
        //driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public boolean verifySearchResults(String carName) {
 
        return driver.getPageSource().contains(carName);
    }


}
