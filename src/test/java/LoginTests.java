import Sayfalar.AnaSayfa;
import Sayfalar.GirişYapSayfası;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;

    private GirişYapSayfası girişYapSayfası;


    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://www.hepsiburada.com");

    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50L));

        anaSayfa.elementGörüneneKadarBekle(anaSayfa.Hesabim);

        anaSayfa.tusaBas(anaSayfa.Hesabim);
        girişYapSayfası.elementGörüneneKadarBekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);

        girişYapSayfası.elementGörüneneKadarBekle(girişYapSayfası.eMailAdresi);
        girişYapSayfası.alanaYazıYaz(girişYapSayfası.eMailAdresi,"SELENYUM@GMAİL.COM" );

        //      driver.findElement(By.id("txtUserName")).sendKeys("selenium@gmail.com");

        girişYapSayfası.elementGörüneneKadarBekle(girişYapSayfası.girisYapTusu);
        driver.findElement(By.id("btnlogiin")).click();
    }

    @Test
    void urunAramaTest(){

        anaSayfa.elementGörüneneKadarBekleCss((anaSayfa.urunarama));
        anaSayfa.alanaYazıYaz(anaSayfa.urunarama, "Araba");
        anaSayfa.klavyeTusunaBas(anaSayfa.urunarama, Keys.ENTER);
        return 1;
    }

}

