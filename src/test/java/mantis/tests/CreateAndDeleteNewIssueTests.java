package mantis.tests;
//мой тест

import mantis.pages.MantisSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private MantisSite mantisSite;

    @Test
    public void createAndDeleteNewIssueTests() throws InterruptedException {
        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuesPage();
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(mantisSite.getReportIssuePage().isEnterIssueDetailsBlockIsDisplayed()).isEqualTo(true);

        mantisSite.getReportIssuePage().createIssue("test1", "test2");
        Thread.sleep(3000);

        String currentTestCaseSummary = mantisSite.getReportIssuePage().checkTestCaseSummary();
        softAssert.assertThat("test1").isEqualTo(currentTestCaseSummary);

        mantisSite.getReportIssuePage().clickInCheckbox();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mantisSite.getReportIssuePage().getDropUpField());
        mantisSite.getReportIssuePage().selectDeleteValue();
        mantisSite.getReportIssuePage().clickOkButton();
        softAssert.assertThat(mantisSite.getReportIssuePage().isAreYouSureBlockIsDisplayed()).isEqualTo(true);
        mantisSite.getReportIssuePage().clickDeleteIssueButton();
        Thread.sleep(3000);
        softAssert.assertAll();
    }
}
