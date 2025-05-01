package com.dubizzle.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.dubizzle.pages.searchpageobjects;

public class SearchItem {

    WebDriver driver;
    searchpageobjects searchPage;

    @Given("I launch the Chrome browser")
    public void launch_browser() {
        WebDriverManager.chromedriver().setup(); 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        searchPage = new searchpageobjects(driver); 
    }

    @When("I open the Dubizzle cars page")
    public void car_page() {
        driver.get("https://dubai.dubizzle.com/");//or i can pass in config.properties also
    }

    @And("I search for {string}")
    public void search_car(String carName) {
        searchPage.searchCar(carName);

    }

    @Then("I should see search results related to {string}")
    public void search_result(String carName) {
        boolean resultsFound = searchPage.verifySearchResults(carName);
        assert resultsFound : "Search results not related to " + carName;
        driver.quit();
    }
}