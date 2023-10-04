package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa {
    public final String  Hesabim = "myAccount" ;
    public final String girisYap = "login";


    public AnaSayfa(WebDriver driver) {
        super(driver);
    }

    public final String urunarama ="[placeholder='Ürün, kategori veya marka ara']";
}
