package kasim_22_okulYonetimi;

import java.util.ArrayList;

import java.util.Scanner;

public class OgrenciMenu implements IIslemler{
    /*
============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
 */

    ArrayList<Ogrenci> ogrenciList=new ArrayList<>();
    Scanner scan = new Scanner(System.in);


    void ogrMenu(){
        System.out.println("============İŞLEMLER============\n"+
                "1-EKLEME\n" +
                "2-ARAMA\n" +
                "3-LİSTELEME\n" +
                "4-SİLME\n" +
                "Q-ÇIKIŞ\n" +
                "SEÇİMİNİZ:");

        while(true) {
            char secim = scan.next().toUpperCase().charAt(0);
            switch (secim) {
                case '1': {
                    ekleme();
                    break;
                }
                case '2': {
                    arama();
                    break;
                }
                case '3': {
                    listeleme();
                    break;
                }
                case '4': {
                    silme();
                    break;
                }
                case 'Q': {
                    cikis();
                    break;
                }
            }
        }

        }


    @Override
    public void ekleme() {
        System.out.println("İsim giriniz: ");
        scan.nextLine();
        String isim= scan.nextLine();
        System.out.println("Soyisim giriniz: ");
        String soyIsim= scan.nextLine();
        System.out.println("TC no giriniz:");
        String tcNo= scan.next();
        System.out.println("Yas girniz :");
        int yas= scan.nextInt();
        System.out.println("sınıf girniz :");
        String  sinif= scan.next();
        System.out.println("öğrenci no giriniz :");
        int ogrNo=scan.nextInt();
        Ogrenci ogrenci = new Ogrenci(isim,soyIsim,tcNo,yas,sinif,ogrNo);
        ogrenciList.add(ogrenci);
        ogrMenu();
    }

    @Override
    public void arama() {
            if ( !ogrenciList.isEmpty()){
                System.out.println("Aranacak TC no giriniz");
                String aranacakTcNo= scan.next();
                for (int i = 0; i <ogrenciList.size(); i++) {
                    if (ogrenciList.get(i).getTcNo().equals(aranacakTcNo)) {
                        System.out.println(ogrenciList.get(i));
                    }
                }
                ogrMenu();
            } else {
                System.out.println("öğrenci listesi boş");
                ogrMenu();
            }
    }

    @Override
    public void listeleme() {
        if (!ogrenciList.isEmpty()) {
            for (Ogrenci each: ogrenciList
                 ) {
                System.out.println(each.toString());
            }
            ogrMenu();
        } else {
            System.out.println("Ogrenci Listesi boş");
            ogrMenu();
        }

    }

    @Override
    public void silme() {
        if (!ogrenciList.isEmpty()){
            System.out.println("silinecek TC no giriniz");
            String aranacakTc= scan.nextLine();
            for (int i = 0; i <ogrenciList.size() ; i++) {
                if (aranacakTc.equals(ogrenciList.get(i).getTcNo())){
                    ogrenciList.remove(i);
                    System.out.println(aranacakTc +" TC nolu öğrenci silindi");
                    ogrMenu();
                }
            }
            ogrMenu();
        }else {
            System.out.println("öğrenci listesi boş");
            ogrMenu();
        }
    }

    @Override
    public void cikis() {
            AnaMenu anaMenu=new AnaMenu();
            anaMenu.anaMenu();

    }
}
