package nedelja7.automation.ui.shoping.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver webDriver;

    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/h2[1]/b[1]")
    private WebElement accountCreatedHeading;

    public Dashboard(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver, this); // ucitaj sve elemente na web stranici
    }





    public String getAccountCreatedHeadingText() {
        return accountCreatedHeading.getText();
    }
}
