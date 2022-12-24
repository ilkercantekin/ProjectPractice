package day03_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BylinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //WebElement giftcardLinki= driver.findElement(By.linkText("Gift Cards"));// bu şekilde bulamadıgı için aşagıdakini yazdık
        Thread.sleep(4000);
        WebElement giftcardLinki= driver.findElement(By.partialLinkText("Gift"));
        giftcardLinki.click();

        // isteneen sayfaya gittiğini test etmek için title ın Gift Card icerdigini test edebiliriz
        String expectedKelime="Gift Cards";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gfit Cards testi PASSED");
             } else System.out.println("Gift Cards testi FAILED");
        driver.close();

    }
}
