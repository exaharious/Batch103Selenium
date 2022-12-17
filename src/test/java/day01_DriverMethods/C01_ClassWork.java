package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Yeni bir package olusturalim : day01
        driver.get("https://www.amazon.com");

        //    Yeni bir class olusturalim : C03_GetMethods
        System.out.println("Sayfa Baslıgı:"+driver.getTitle());

        //    Amazon sayfasina gidelim. https://www.amazon.com/
        String actualTitle = driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("amazon")){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("Window Handle Değeri : "+driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");

        //Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak için close() methodu kullanırız
    }
}
