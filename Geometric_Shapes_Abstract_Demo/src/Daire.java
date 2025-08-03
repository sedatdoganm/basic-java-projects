public class Daire extends Sekil{

    int yariCap;

    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {
        double alan = Math.PI*yariCap*yariCap;
        System.out.println(getIsim()+ " seklinin alani: " + alan);
    }

    @Override
    void cevreHesapla() {
        double cevre = 2*Math.PI*yariCap;
        System.out.println(getIsim()+ " seklinin cevresi: " + cevre);
    }
}
