package FIS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageFIS {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy (xpath = "//span[text()='Импорт ']")
    private WebElement importPage;

    @FindBy (xpath = "//span[@data-name='Create']")
    private WebElement createCessionButton;

    @FindBy (css = "#MainViewport > div > div.VCMTopToolbar > div.systemAuth > div.rightPanel > div.icon22.profile")
    private WebElement userProfileButton;

    @FindBy (xpath = "//*[@id='MainViewport']/div/div[1]/div[3]/div[3]/div[3]/div")
    private WebElement formsButton;

    @FindBy (xpath = "//li[text()='Главный интерфейс']")
    private WebElement mainInterfaceButton;








    public MainPageFIS(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void clickOnImportPage() {importPage.click();}
    public void clickOnCreateCessionButton() {createCessionButton.click();}
    public void clickOnUserProfileButton() {userProfileButton.click();}
    public WebElement getUserProfileButton() {return userProfileButton;}
    public void goToMainInterface() {mainInterfaceButton.click();}
    public void clickOnFormsButton() {formsButton.click();}
}
