package FIS.tests;
//мой тест

import FIS.pages.FISSite;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class CreateAndDeleteNewIssueTests extends BaseTest {
    private FISSite FISSite;

    @Test
    public void createAndDeleteNewIssueTests() throws InterruptedException {
        FISSite = new FISSite(driver);
//        FISSite.login("admin", "admin20");

        FISSite.getMainPage().goToReportIssuesPage();
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(FISSite.getReportIssuePage().isEnterIssueDetailsBlockIsDisplayed()).isEqualTo(true);

        FISSite.getReportIssuePage().createIssue("test1", "test2");
        Thread.sleep(3000);

        String currentTestCaseSummary = FISSite.getReportIssuePage().checkTestCaseSummary();
        softAssert.assertThat("test1").isEqualTo(currentTestCaseSummary);

        FISSite.getReportIssuePage().clickInCheckbox();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FISSite.getReportIssuePage().getDropUpField());
        FISSite.getReportIssuePage().selectDeleteValue();
        FISSite.getReportIssuePage().clickOkButton();
        softAssert.assertThat(FISSite.getReportIssuePage().isAreYouSureBlockIsDisplayed()).isEqualTo(true);
        FISSite.getReportIssuePage().clickDeleteIssueButton();
        Thread.sleep(3000);
        softAssert.assertAll();
    }
}
