package Selenyum_Practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    /*
    " amazon.com" adresine gidelim
     -bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
     -title ve url'nin "spend" kelimesinin icerip icermedigini kontrol edelim
     -Ardindan "trendyol.com" adresine gidelim
     -bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
     -Bi onceki web sayfamiza geri donelim
     -sayfayi yenileyelim
     -Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        String actualTitle = driver.getTitle();
        String actualUrl= driver.getCurrentUrl();
        System.out.println(actualTitle);
        System.out.println(actualUrl);


    }
}
