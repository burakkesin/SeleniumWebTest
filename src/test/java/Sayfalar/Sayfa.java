package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;

    public  Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void elementGörüneneKadarBekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void elementGörüneneKadarBekleCss(String elementId){
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }



    public void tusaBas(String TusId){
        driver.findElement(By.id(TusId)).click();
    }
    public void alanaYazıYaz(String elementId,String eMailAdresi){
        driver.findElement(By.id(elementId)).sendKeys("eMailAdresi");
    }

    public void alanaYazıYazCss(String elementId,String yazı){
        driver.findElement(By.cssSelector(elementId)).sendKeys("yazı");
    }

    public void klavyeTusunaBas(String elementId, Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }
}
