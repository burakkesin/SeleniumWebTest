package Sayfalar;

import Sayfalar.Sayfa;
import org.openqa.selenium.WebDriver;

public class GirişYapSayfası extends Sayfa {

    public final String eMailAdresi = "txtUserName";
    public final String girisYapTusu ="btnlogin";

    public GirişYapSayfası(WebDriver driver) {
        super(driver);
    }
}
