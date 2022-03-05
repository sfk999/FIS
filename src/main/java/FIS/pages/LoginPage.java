package FIS.pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(id = "field-login")
    private WebElement loginField;

    @FindBy(id = "field-password")
    private WebElement passwordField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }




    public void login(String login, String password) {
//        driver.get("http://nsk-fis-dev.corp.bsv.legal:8080/web/21-07-21_17-39/FormRunner/");
//        Assertions
        loginField.clear();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
//        loginField.sendKeys(Keys.ENTER);
    }
}

