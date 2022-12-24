package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {
        // amazona gidip nutella için arama yapın. ilk sayfada cıkan
        // urunlerin içerisinde en yuksek fiyatı bulun
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> fiyatlarlistesi=driver.findElements(By.className("a-price-whole"));
        // Webelement bir obje old.dan direk yazılamaz
        System.out.print(fiyatlarlistesi);

        // bunun için for-each loop kullanılarak herbir Webelement üzerindeki yazıları tek tek yazdırmalıyız

        for (WebElement each:fiyatlarlistesi
             ) {
            System.out.println(each.getText()+" ");
        }
        // en yuksek fiyatlıı urunu bulamabilmek için java ile kod yazmalıyız
        //1- web elementlerinden getText ile String olarak alını
        //2- string fiyatı kıyaslama yapabilmek için integere cevirin
        //3- en yuksek fiyatı bulup yazdırın

        String fiyatStr;
        int fiyatint = 0;
        int enyuksekFiyat=0;
        for (WebElement each:fiyatlarlistesi
             ) {
            fiyatStr=each.getText();
            fiyatint=Integer.parseInt(fiyatStr);

            if (fiyatint>enyuksekFiyat){
                enyuksekFiyat=fiyatint;
            }
        }
        System.out.println("");
        System.out.println("en yuksek urun fiyatı=" + enyuksekFiyat);

        Thread.sleep(3000);
        driver.close();


    }
}
