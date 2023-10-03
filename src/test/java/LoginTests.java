import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {

    @Test
    void hepsiburadaLoginTesti(){

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.hepsiburada.com");

    }
}
