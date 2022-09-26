package nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Alerts {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\Documents\\GitHub\\Radomi-LukovicQA\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.manage().window().maximize();

        wd.get("https://demoqa.com/alerts");


        wd.get("https://demoqa.com/alerts");

        WebElement webElement = wd.findElement(By.id("alertButton"));
        clickAndAccept(webElement, wd);
        webElement.click();
        wd.switchTo().alert().accept();

        WebElement timerAlertButton = wd.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
      //new WebDriverWait(wd, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        wd.switchTo().alert().accept();

        WebElement confirmButton = wd.findElement(By.id("confirmButton"));
        clickAndAccept(confirmButton, wd);
        WebElement confirmResult1 = wd.findElement(By.id("confirmResult"));
        System.out.println(confirmResult1.getText().contains("Ok"));
        confirmButton.click();
        wd.switchTo().alert().dismiss();
        System.out.println(confirmResult1.getText().contains("Cancel"));

        WebElement promtButton = wd.findElement(By.id("promtButton"));
        promtButton.click();
        wd.switchTo().alert().sendKeys("test");
        wd.switchTo().alert().accept();
        WebElement promptResult = wd.findElement(By.id("promptResult"));
        System.out.println(promptResult.getText().contains("test"));

    }

    private static void clickAndAccept(WebElement webElement, WebDriver webDriver) {
        webElement.click();
        webDriver.switchTo().alert().accept();
    }

    private static void clickWaitAndAccept(WebElement webElement, WebDriver webDriver) {

    }

    private static void clickSendKeysAndAccept(WebElement webElement, WebDriver webDriver) {

    }
    }
