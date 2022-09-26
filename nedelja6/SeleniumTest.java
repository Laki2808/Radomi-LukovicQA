package nedelja6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SeleniumTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\Documents\\GitHub\\Radomi-LukovicQA\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/");
        wd.manage().window().maximize(); // maksimizuje prozor


    }

}