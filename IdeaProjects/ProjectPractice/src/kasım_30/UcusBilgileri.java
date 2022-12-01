package kasım_30;

import java.util.Scanner;

public class UcusBilgileri {


    Scanner scan = new Scanner(System.in);
    public void ucusKontrol() {
        System.out.println("yapmak istediginiz yolculuk cesidini seciniz : Tek yon için 1, çift yön için 2 ye basınız :");
        int secim=scan.nextInt();
        switch (secim) {
            case 1:{
                tekYon();
                break;
            }
            case 2:{
                ciftYon();
                break;
            }
            default:{
                System.out.println("yanlis deger girdiniz");
                ucusKontrol();
            }
        }
    }

    private void ciftYon() {
        tekYon();
        System.out.println("dönüş noktasını giriniz :");
        String inis=scan.nextLine();
        System.out.println("dönüş tarihini giriniz :(yyyy/mm/dd)");
        String tarih=scan.nextLine();
    }

    int fiyatHesapla() {

        return (int) (Math.random()*1000);
        }
        private void tekYon() {
            System.out.println("kalkış noktasını giriniz :");
            String kalkis=scan.nextLine();
            System.out.println("iniş noktasını giriniz :");
            String inis=scan.nextLine();
            System.out.println("gidiş tarihini giriniz :(yyyy/mm/dd)");
            String tarih=scan.nextLine();
        }









}
