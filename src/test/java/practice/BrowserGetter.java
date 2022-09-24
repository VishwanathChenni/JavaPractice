package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

class BrowserGetter {
    public WebDriver getChromeDriver() {
        String sMyString="Hello";
        for(int i=0;i<sMyString.length();i++){
            char myChar=sMyString.charAt(i);
        }
        System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
                
    }
}
