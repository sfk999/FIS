package FIS.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;

    @BeforeEach
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://nsk-fis-dev.corp.bsv.legal:8080/web/21-07-21_17-39/FormRunner/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
