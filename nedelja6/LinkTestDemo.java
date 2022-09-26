package nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class LinkTestDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\Documents\\GitHub\\Radomi-LukovicQA\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();


        wd.get("https://demoqa.com/links");

        WebElement homeLink = wd.findElement(By.id("simpleLink"));

        System.out.println(homeLink.getAttribute("href"));
        String homeLinkUrl = homeLink.getAttribute("href");

        HttpURLConnection httpURLConnection = (HttpURLConnection) (new URL(homeLinkUrl)).openConnection();

        httpURLConnection.setRequestMethod("GET");

        httpURLConnection.connect();


        System.out.println(httpURLConnection.getResponseCode());

        int responseCode = httpURLConnection.getResponseCode();
        System.out.println(responseCode >= 200 && responseCode < 300); // sve je OK, server je vratio odgovor

        WebElement createdLink = wd.findElement(By.id("created"));

        String createdLinkUrl = createdLink.getAttribute("href");

        System.out.println(createdLinkUrl);

        if (createdLinkUrl.contains("http")) {
            httpURLConnection = (HttpURLConnection) (new URL(createdLinkUrl)).openConnection();

            httpURLConnection.setRequestMethod("GET");

            httpURLConnection.connect();
        }








    }
}
