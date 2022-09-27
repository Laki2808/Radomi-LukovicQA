package nedelja7.automation.ui.shoping.tests;

import nedelja7.automation.ui.shoping.pages.Dashboard;
import nedelja7.automation.ui.shoping.pages.Login;
import nedelja7.automation.ui.shoping.pages.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSignUp {
    private WebDriver webDriver;
    private Login login;
    private SignUp signUp;
    private Dashboard dashBoard;
    private Select select;

    @BeforeMethod
    public void configure() {
        System.out.println("Ovo se izvrsva pre pokretanja test metode");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\Documents\\GitHub\\Radomi-LukovicQA\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        login = new Login(webDriver);
        signUp = new SignUp(webDriver);
        dashBoard = new Dashboard(webDriver);
        webDriver.get("https://www.automationexercise.com/login");
        webDriver.manage().window().maximize();
    }
    @Test
    public void testSingUp() {

        login.inputNameField("name");
        login.inputEmailField("lakilukovic@yahoo.com");
        login.clickSingUp();
        signUp.clickTitle();
        signUp.inputName("name");
        signUp.inputPassword("1234567");
        signUp.selectDays(2);
        signUp.selectMonths("January");
        signUp.selectYear(1991);
        signUp.inputFirstName("name");
        signUp.inputLastName("name");
        signUp.inputAddress("Beo");
        signUp.selectCountry("India");
        signUp.inputState("India");
        signUp.inputCity("City");
        signUp.inputZipcode("11000");
        signUp.inputMobile("064123456");
        signUp.createAccount();
        Assert.assertEquals(dashBoard.getAccountCreatedHeadingText(), "ACCOUNT CREATED!",
                "The message should be correct");
    }

    @AfterMethod
    public void close() {
        webDriver.close();
    }
}
