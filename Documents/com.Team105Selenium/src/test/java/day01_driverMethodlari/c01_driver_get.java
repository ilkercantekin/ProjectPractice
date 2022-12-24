package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class c01_driver_get {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver_win32/chromedriver.exe");
   // windows ta sonda .exe olmalı
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/deal/13922469?pf_rd_r=M3CNXF5B1NW0DSWJCWP4&pf_rd_p=111459bf-2bbb-49ea-a5db-e98c1bb16031&pd_rd_r=bfb57d0a-c646-48dc-a2eb-5cd131e09e76&pd_rd_w=MBT40&pd_rd_wg=8Yiu7&ref_=pd_gw_unk");
  Thread.sleep(15000);
  driver.close();
/*
Selenium jar dosyalarini ve chrome driver ini manuel olarak sisteme
tanitmis olduk. Eger Firefox veya Safari ile calismamiz gerekse, o zaman da onlarin driver larini indirip
manuel olarak 8. satirdaki gibi o driverlari tanimlamaliyiz.
 *//*
        1- Selenium jar dosyalarini ve chromedriver'ini manuel olarak sisteme
tanitmis olduk.

Eger firefox veya safari ile calismamiz gerekirse bu defa da
onlarin driver'larini indirip, manuel olarak
9.satirda olan driver'lari tanimlamaliyiz.

2- 12.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
bu objeyi kullanmasak bile
bu satirdan dolayi bos bir browser acilir

3- driver.get(url) driver'i yazdigimiz url'e goturur
url yazarken www yazmasak dahi calisir
ancak https:// yazmazsak method calismaz.
         */
    }
}
