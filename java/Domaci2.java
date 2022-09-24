import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Domaci2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\IdeaProjects\\Radomir-Lukovic\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://demoqa.com/automation-practice-form");
        wd.findElement(By.id("firstName")).clear();
        wd.findElement(By.id("firstName")).sendKeys("Radomir");
        wd.findElement(By.id("lastName")).clear();
        wd.findElement(By.id("lastName")).sendKeys("Lukovic");
        wd.findElement(By.id("userEmail")).clear();
        wd.findElement(By.id("userEmail")).sendKeys("lakilukovic@yahoo.com");
        wd.findElement(By.className("custom-control-label")).click();






    }
    }
