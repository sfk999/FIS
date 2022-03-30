package FIS.tests;

import FIS.pages.FISSite;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;

public class ImportPageTests extends BaseTest{
    private FISSite FISSite;
// тест для создания цессии и загрузки цессии
//  лучше добавить implicitly wait для тестов.
    @Test
    public void successfullImportTest() throws InterruptedException {

        FISSite = new FISSite(driver);
        FISSite.getLoginPage().login("muzhanovskiy", "muzhanovskiy");

        FISSite.getMainPageFIS().clickOnImportPage();
        FISSite.getMainPageFIS().doubleClickOnCessionName();
        Thread.sleep(3000);
        FISSite.getMainPageFIS().clickOnTabImport();
        FISSite.getMainPageFIS().clickOnImportNewFileButton();
        Thread.sleep(3000);

        File file = new File("src/test/java/FIS/tests/Продажа Авантаж на Сириус (1).xlsx");
        FISSite.getMainPageFIS().getAddFileButton().sendKeys(file.getAbsolutePath());
        System.out.println("path is " + file.getAbsolutePath());
//        uploadPicture.sendKeys(file.getAbsolutePath());
        Thread.sleep(3000);



    }

}



//        Thread.sleep(10000);
//        WebDriverWait wait = new WebDriverWait(driver, 30, 500);
//        Thread.sleep(5000);

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#MainViewport > div > div.VCMTopToolbar > div.systemAuth > div.rightPanel > div.icon22.profile")));

//        Thread.sleep(5000);

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
//          для прокрутки вниз
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FISSite.getMainPageFIS().getImportNewFileButton());