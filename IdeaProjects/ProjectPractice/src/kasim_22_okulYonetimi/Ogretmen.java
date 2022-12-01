package kasim_22_okulYonetimi;

public class Ogretmen extends Kisi {
    private String bolum;
    private int sicilno;

    public Ogretmen(){

    }
    public Ogretmen(String isim,String soyIsim,String tcNo, int yas, String bolum, int sicilno) {
        super(isim,soyIsim,tcNo,yas);
        this.bolum=bolum;
        this.sicilno=sicilno;
    }
    public String getbolum(){
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilno() {
        return sicilno;
    }

    public void setSicilno(int sicilno) {
        this.sicilno = sicilno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bolum='" + bolum + '\'' +
                ", sicilno=" + sicilno ;
    }
}
