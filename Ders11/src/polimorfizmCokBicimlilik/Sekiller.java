package polimorfizmCokBicimlilik;

//final tanimlanan sinif extends edilemez
//public final class Sekiller { gibi

public class Sekiller {

    public double alanHesapla() {
        return 0;
    }

    public double cevreHesapla() { //final verilemez, final verilirse override edilemez
        return 0;
    }
}
