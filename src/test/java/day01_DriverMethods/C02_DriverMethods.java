package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //boş bir browser açtık
        driver.get("https://amazon.com"); //ilk olarak gitmak istedigimiz sayfayı belirtiriz
        System.out.println("Sayfa Başlıgı : "+driver.getTitle());

        System.out.println("Sayfa Url i : " +driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());// Bize o window a ait hash degerini verir.Biz bu hash degerlerini
        //Bir string'e atayıp penceler arası geçiş yapabiliriz

    }
}
