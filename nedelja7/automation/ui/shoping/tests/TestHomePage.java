package nedelja7.automation.ui.shoping.tests;

import nedelja6.PropertiesReader;
import nedelja7.automation.ui.shoping.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePage {
    private final static String MODAL_TITLE_EXPECTED = "Added!";

    /**
     * Test steps:
     * 1. Idem na home
     * 2. Scroll do prve haljine
     * 3. Hover na tu haljinu (koristimo Actions, moveToElement(element).perform()
     * 4. Kliknemo 'add to card'
     * 5. Potvrdimo da se pojavilo 'Added'
     * 6. Kliknemo view cart
     * 7. Potvrdimo da je haljina u korpi
     */
    @Test
    public void testAddToShoppingCard() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\Documents\\GitHub\\Radomi-LukovicQA\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();
        wd.get("https://www.automationexercise.com/");
        wd.manage().window().maximize();
        HomePage homePage = new HomePage(wd);
        homePage.clickOnHome();
        homePage.scrollToDress(2);
        homePage.hoverToDress(2);
        homePage.clickToAddCartButton();
        Assert.assertEquals(homePage.getModalTitle(), MODAL_TITLE_EXPECTED, "The text should be added");
        homePage.clickToViewCartButton();
        WebElement slika = wd.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]"));
        String actualUrl = slika.getAttribute("src");
        Assert.assertEquals(actualUrl, "https://www.automationexercise.com/get_product_picture/1", "the url should be 'get_product_picture/1'");
        //endregion
        wd.close();
    }

}
