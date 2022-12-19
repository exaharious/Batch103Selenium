package Selenium_tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManegeMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari : "+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //Simge durumunda 3 saniye bekleyin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumuna getirin
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari : "+driver.manage().window().getSize());

        //Sayfayi fullscren yapın
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscren durumuna getirin
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari : "+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
