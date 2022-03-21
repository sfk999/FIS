package FIS.pages;

import org.openqa.selenium.WebDriver;

public class FISSite {
    private final WebDriver driver;
    private LoginPage loginPage;
    private PasswordPage passwordPage;
    private MainPage mainPage;
    private ReportIssuePage reportIssuePage;
    private MainPageFIS mainPageFIS;

    public FISSite(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        passwordPage = new PasswordPage(driver);
        mainPage = new MainPage(driver);
        reportIssuePage = new ReportIssuePage(driver);
        mainPageFIS = new MainPageFIS(driver);

    }

//    public void login(String login, String password) {
//        loginPage.login(login);
//        loginPage.login(password);
//        passwordPage.login(password);
//    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public PasswordPage getPasswordPage() {
        return passwordPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public MainPageFIS getMainPageFIS() {
        return mainPageFIS;
    }

    public ReportIssuePage getReportIssuePage() {
        return reportIssuePage;
    }
}
