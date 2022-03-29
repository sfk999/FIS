package FIS.tests;

import FIS.pages.FISSite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImportPageTests extends BaseTest{
    private FISSite FISSite;
// тест для создания цессии и загрузки цессии
//  лучше добавить implicitly wait для тестов.
    @Test
    public void successfullImportTest() throws InterruptedException {

        FISSite = new FISSite(driver);
        FISSite.getLoginPage().login("muzhanovskiy", "muzhanovskiy");


//        Thread.sleep(10000);
//        WebDriverWait wait = new WebDriverWait(driver, 30, 500);
//        Thread.sleep(5000);

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#MainViewport > div > div.VCMTopToolbar > div.systemAuth > div.rightPanel > div.icon22.profile")));

//        Thread.sleep(5000);

        FISSite.getMainPageFIS().clickOnImportPage();
//        Thread.sleep(5000);

//        FISSite.getMainPageFIS().clickOnCreateCessionButton();

//        кликает на профиль юзера и проверяет что залогинились
//        FISSite.getMainPageFIS().clickOnUserProfileButton();
//        String currentUserName = FISSite.getMainPage().getUserName();
//        Assertions.assertEquals("супервизор", currentUserName);

//        кликает на кнопку форм и выбирает Главный интерфейс
//        FISSite.getMainPageFIS().clickOnFormsButton();
//        Thread.sleep(5000);
//        FISSite.getMainPageFIS().goToMainInterface();
        FISSite.getMainPageFIS().doubleClickOnCessionName();

        FISSite.getMainPageFIS().clickOnVkladka();
        Thread.sleep(5000);





    }

}
