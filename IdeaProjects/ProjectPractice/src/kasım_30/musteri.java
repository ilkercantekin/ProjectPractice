package kasım_30;

import java.util.HashMap;
import java.util.Scanner;

public class musteri {

    /*
        1-) Kullanicinin ucak bileti almasi icin once kullanicinin bir hesabi var mi yok mu kontrol ediniz
        2-) Kullaniciya tek yon mu gidis donus mu bilet almak istediginiz sorun
        3-) Kullanicinin kaydi varsa kalkis yerini, gidicegi yeri kalkis saatini ve tarihini ogrenin. Ve bilet fiyatini kullaniciya gosterin
        4-) Eğer bilet fiyati kisiye uygun gelmediyse vazgecme opsiyonu ekleyin
     */
    HashMap<String ,String> kullanicilar= new HashMap<>();
    Scanner scan=new Scanner(System.in);
    public void musterikontrol() {
        System.out.println("kullanıcı adı giriniz");
        String username= scan.nextLine();
        if (!kullanicilar.containsKey(username)) {
            System.out.println("kullanıcı kayıtlı değil");
            musteriKayit();
        }else {
            System.out.println("şifre giriniz :");
            String password= scan.next();
            if (kullanicilar.get(username).equals(password)) {
                System.out.println("Sisteme basarı ile giriş yapılmıştır");
            } else { int sayac=0;
                while (!kullanicilar.get(username).equals(password)){
                    System.out.println("şifreyi yanlış girdiniz tekrar giriniz");
                    sayac++;
                    if (sayac==5) musteriKayit();
                }
            }
        }
    }
    public void musteriKayit() {
        System.out.println("kullanıcı adı giriniz");
        String username= scan.nextLine();
        if(kullanicilar.containsKey(username)){
            System.out.println("bu ismde kullanıcı kayıtlı  tekrar giriniz");
            musteriKayit();
        }
        else System.out.println("şifre giriniz :");
        String password=scan.next();
        kullanicilar.put(username,password);
        System.out.println("kayıt yapılmiştir ");
    }

}
