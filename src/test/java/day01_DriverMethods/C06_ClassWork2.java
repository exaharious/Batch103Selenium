package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ClassWork2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Bu method sayfadaki her bir web element icin
                                                                          // max. bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle= driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED==>"+actualTitle);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualurl=driver.getCurrentUrl();
        if (actualurl.contains("facebook")){
            System.out.println("Url  testi PASSED");
        }else System.out.println("Url  testi FAILED" +actualurl);
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmartTitle= driver.getTitle();
        String expectedWalmartTitle="Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAİLED");
        //Tekrar "facebook" sayfasina donun.
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        // 9.Browser'i kapatin
        driver.close();

    }
}
