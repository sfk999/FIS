package FIS.pages;
// мой

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(id = "summary")
    private WebElement summaryField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(css = "input[tabindex='18']")
    private WebElement submitIssueButton;

    @FindBy(css = "#buglist>tbody>tr:nth-child(1)>td.column-summary")
    private WebElement testCaseSummary;

    @FindBy(css = "#buglist>tbody>tr:nth-child(1) span[class='lbl']")
    private WebElement checkbox;

    @FindBy(name = "action")
    private WebElement dropUpField;

    @FindBy(css = "[type='submit'][value='OK']")
    private WebElement okButton;

    @FindBy(css = "[value='Delete Issues']")
    private WebElement deleteIssuesButton;

    @FindBy(css = "#report_bug_form > div > div.widget-header.widget-header-small > h4")
    private WebElement enterIssueDetailsBlock;

    @FindBy(css = "#action-group-div > form > div > div.widget-header.widget-header-small > h4")
    private WebElement areYouSureBlock;

    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
        PageFactory.initElements(driver, this);
    }

    public void createIssue(String summary, String description) {
        summaryField.sendKeys(summary);
        descriptionField.sendKeys(description);
        submitIssueButton.click();
    }

    public String checkTestCaseSummary() {
        return testCaseSummary.getText();
    }

    public void clickInCheckbox() {
        checkbox.click();
    }

    public WebElement getDropUpField() {
        return dropUpField;
    }

    public void selectDeleteValue() {
        Select selectDropUpField = new Select(dropUpField);
        selectDropUpField.selectByIndex(4);
    }

    public void clickOkButton() {
        okButton.click();
    }

    public void clickDeleteIssueButton() {
        deleteIssuesButton.click();
    }

    public boolean isEnterIssueDetailsBlockIsDisplayed() {
        return enterIssueDetailsBlock.isDisplayed();
    }

    public boolean isAreYouSureBlockIsDisplayed() {
        return areYouSureBlock.isDisplayed();
    }
}






