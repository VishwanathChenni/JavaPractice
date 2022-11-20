package com.my.stuff.main.steps;

import com.my.stuff.main.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageSteps {
    @Test
    public void fnTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        HomePage homePage= new HomePage(driver);
        homePage.ClickLinkDropDown();
    }

}
