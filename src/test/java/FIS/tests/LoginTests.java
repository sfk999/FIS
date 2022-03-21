package FIS.tests;

import FIS.pages.FISSite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTests extends BaseTest{

    private FISSite FISSite;

//    @Test
//    public void loginUrlTest() {
//        String currentUrl = driver.getCurrentUrl();
//        Assertions.assertEquals("https://academ-it.ru/mantisbt/login_page.php", currentUrl);
//    }

//    @Test
//    public void loginTitleTest() {
//        String currentTitle = driver.getTitle();
//        Assertions.assertEquals("MantisBT", currentTitle);
//    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        FISSite = new FISSite(driver);

        FISSite.getLoginPage().login("muzhanovskiy", "muzhanovskiy");
//        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 30, 500);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#MainViewport > div > div.VCMTopToolbar > div.systemAuth > div.rightPanel > div.icon22.profile")));
        WebElement awd = driver.findElement(By.cssSelector("#MainViewport > div > div.VCMTopToolbar > div.systemAuth > div.rightPanel > div.icon22.profile"));
        awd.click();
        Thread.sleep(2000);
        String currentUserName = FISSite.getMainPage().getUserName();
        Assertions.assertEquals("супервизор", currentUserName);
//        Thread.sleep(5000);
    }
}
