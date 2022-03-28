package FIS.tests;

import FIS.pages.FISSite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    private FISSite FISSite;
    public BaseTest() {
    }

    @BeforeEach
    public void setUp() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 30,500);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



        driver.get("http://nsk-fis-dev.corp.bsv.legal:8080/web/21-07-21_17-39/FormRunner/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




//        Thread.sleep(3000);
    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
