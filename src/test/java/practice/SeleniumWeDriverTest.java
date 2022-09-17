package practice;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SeleniumWeDriverTest {

    private WebDriver driver;
    private final BrowserGetter browserGetter = new BrowserGetter();

    @BeforeAll
    void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @Test
    void myTest() {
        String expectedTitle = "Example Domain";
        driver.get("https://www.example.com");
        driver.getTitle();
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @AfterAll
    void afterAll() {
        driver.quit();
    }
}
