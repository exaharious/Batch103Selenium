package Selenium_tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("http://amazon.com");

        //techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("http://techproeducation.com");


        //Tekrar Amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar techproeducation sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayi kapatalim
        driver.close();


    }
}
