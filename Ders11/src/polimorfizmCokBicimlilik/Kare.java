package polimorfizmCokBicimlilik;

public class Kare extends Sekiller {

    private double kenar;

    public Kare() {

    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return this.kenar * this.kenar; //kenar*kenar da yazilabilir. arka tarafta kendisi derliyor
    }

    @Override
    public double cevreHesapla() {
        return 4 * this.kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return this.kenar;
    }
}
