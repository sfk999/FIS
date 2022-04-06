package FIS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MainPageFIS {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;
//    Actions doubleClick = new Actions(driver);


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

    @FindBy (xpath = "//tr[@data-columns-row-id='84']/td/div/div/span")
    private WebElement cessionName;

    @FindBy (css = "#head_tab_60c215ef1a30f > div")
    private WebElement tabImport;

    @FindBy (css = "[data-name='Import_new_file']")
    private WebElement importNewFileButton;

    @FindBy (css = "[class='jq_attach__button jq_attach__add_button']")
    private WebElement addFileButton;







    public MainPageFIS(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnImportPage() {importPage.click();}
    public void clickOnCreateCessionButton() {createCessionButton.click();}
    public void clickOnUserProfileButton() {userProfileButton.click();}
    public WebElement getUserProfileButton() {return userProfileButton;}
    public void goToMainInterface() {mainInterfaceButton.click();}
    public void clickOnFormsButton() {formsButton.click();}
    public void clickOnImportNewFileButton() {importNewFileButton.click();}
    public void doubleClickOnCessionName() {actions.doubleClick(cessionName).perform();}
    public void clickOnTabImport() {tabImport.click();}
    public WebElement getImportNewFileButton() {return importNewFileButton;}
    public WebElement getAddFileButton() {return addFileButton;}

    File file = new File("src/test/java/FIS/tests/Продажа Авантаж на Сириус (1).xlsx");
    public void tryToAddFile() {getAddFileButton().sendKeys(file.getAbsolutePath());

    }
}
