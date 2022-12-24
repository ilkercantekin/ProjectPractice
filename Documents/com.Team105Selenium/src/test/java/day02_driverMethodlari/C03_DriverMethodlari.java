package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //System.out.println(driver.getPageSource()); testte yazdrmak mantıklı değildir
// pagesource un 'MEOW' içerdigini test edin

        String pagesource = driver.getPageSource();
        String expectedKelime="MEOW";

        if(pagesource.contains(expectedKelime)){
            System.out.println("page source testi PASSED");
        }else{
            System.out.println("Page source testi FAILED, MEOW kelimesi bulunamadı");
        }
        Thread.sleep(3000);
        driver.close();



    }
}
