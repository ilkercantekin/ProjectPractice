package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExercise {
    public static void main(String[] args) throws InterruptedException {
        // 1- bir test classı oluşturun ve ayarları yapın
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2- https://automationexercise.com adresine gidin
        driver.get("https://automationexercise.com");
        //3- sayfada 147 tane link bulundugunu test edin
        List<WebElement>linkListesi=driver.findElements(By.tagName("a"));
        if (linkListesi.size()==147){
            System.out.println("link listesi testi PASSED");
        }else System.out.println("Sayfada"+ linkListesi.size() + "adet link var, test FAİLED");

        // 4- products linkine tılayın
        driver.findElement(By.partialLinkText("Products")).click();

        // 5- special offer yazısının göründüğünü test edin
        WebElement specialOfferElement=driver.findElement(By.id("sale_image"));
        if (specialOfferElement.isDisplayed()){
            System.out.println("special offer testi PASSED");
        } else System.out.println("special offer testi FAİLED");

        /*
        NoSuchElementException; driver findElement ile arandıgı bir elementi bulamzsa olusur
         */

        Thread.sleep(3000);
        driver.close();
    }
}
