import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.hepsiburada.com");
        driver.findElement(By.id("myAccount")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("login")).click();
        Thread.sleep(2500);

        driver.findElement(By.id("txtUserName")).sendKeys("selenium@gmail.com");
        Thread.sleep(2500);

        driver.findElement(By.id("btnlogiin")).click();
    }

}

