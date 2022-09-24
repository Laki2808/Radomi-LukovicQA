import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Domaci1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Win10\\IdeaProjects\\Radomir-Lukovic\\chromedriver.exe");


        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("https:/demoqa.com/text-box");
        Thread.sleep(3000);
        WebElement fullName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]"));
        System.out.println(fullName.getText());
        WebElement email = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]"));
        System.out.println(email.getText());
        WebElement currentAdress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/label[1]"));
        System.out.println(currentAdress.getText());
        WebElement permanentAdress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/label[1]"));
        System.out.println(permanentAdress.getText());
        WebElement button = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("ITBootcamp");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]")).sendKeys("qa@itbootcamp.com");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]")).sendKeys("online class");
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]")).sendKeys("live class");
        Thread.sleep(1000);

        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("arguments[0].click()", button);
        WebElement proveraImena = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[1]"));
        WebElement proveraEmail = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[2]"));
        WebElement proveraAdrese = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]"));
        WebElement proveraAdresedva = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]"));
        if (proveraImena.getText().equalsIgnoreCase("name:itbootcamp")){
            System.out.println(true);
        } else
            System.out.println(false);
        if (proveraEmail.getText().equalsIgnoreCase("email:qa@itbootcamp.com")){
            System.out.println(true);
        } else
            System.out.println(false);
        if (proveraAdrese.getText().equalsIgnoreCase("current address :online class")){
            System.out.println(true);
        } else
            System.out.println(false);
        if (proveraAdresedva.getText().equalsIgnoreCase("permananet address :live class")){
            System.out.println(true);
        } else
            System.out.println(false);

        Thread.sleep(3000);
        wd.close();

    }
}


