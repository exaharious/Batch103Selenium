package Selenium_instruaction.day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_ManageMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları = "+driver.manage().window().getSize());

        //Sayfayi kapatin
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
