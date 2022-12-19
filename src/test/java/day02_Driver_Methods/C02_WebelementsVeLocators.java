package day02_Driver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebelementsVeLocators {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim.
        driver.get("https://www.amazon.com");

        //Search bölümünü locate edelim.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Searc bölümünde iphone aratalım.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        /*
            Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
            etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
            Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
            Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
            findElement(BY.id("attribute degeri")) seklinde yazariz.
        */

        //Amazon sayfasindaki <input> ve <a> taglarının sayısını yazdırınız.

        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println("input Tag sayisi ="+inputTags.size());

        List<WebElement> linklerlist=driver.findElements(By.tagName("a"));
        System.out.println("a sayısı ="+linklerlist.size());
    }
}
