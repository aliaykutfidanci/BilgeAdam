package polimorfizmCokBicimlilik;

import java.util.zip.DeflaterOutputStream;

public class Dikdortgen extends Sekiller {

    private double en;
    private double boy;

    public Dikdortgen() {


    }

    public Dikdortgen(double en, double boy) {

        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alanHesapla() {
        return this.en * this.boy;
    }

    @Override
    public double cevreHesapla() {
        return 2 * this.en + 2 * this.boy;

    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getEn() {
        return this.en;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getBoy() {
        return this.boy;
    }


}
