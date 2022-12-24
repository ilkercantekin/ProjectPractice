package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //get ile aynı işlemi yapar aşagıdaki
        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);
        //yeniden amazona dönelim
        driver.navigate().back();

        Thread.sleep(3000);
        // tekrar wisequarter a dönelim
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.close();

    }
}
