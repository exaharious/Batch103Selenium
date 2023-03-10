package day02_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim.
        driver.get("http://www.amazon.com");
        // Search bolumunu locate edip iphone kelimesini aratalim.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        // Arama sonuc yazisini konsola yazdiralim.
        WebElement aramasonucYazisi= driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonucYazisi.getText());
        // Sayfayi kapatalim.
        driver.close();


    }
}
