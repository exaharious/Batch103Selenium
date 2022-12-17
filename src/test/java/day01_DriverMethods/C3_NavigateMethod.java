package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_NavigateMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //Techproeducation sayfasına gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://techproeducation.com");
        //Tekrar Amazon sayfasına dönelim
        driver.navigate().back();
        //Tekrar Hepsiburada sayfasına gidelim
        driver.navigate().forward();
        //Son sayfada sayfayı yenileyelim(refresh)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        //Ve sayfayı kapatalım

    }
}
