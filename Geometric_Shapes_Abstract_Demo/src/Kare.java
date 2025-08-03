public class Kare extends Sekil{

    private int a;
    public Kare(String isim, int a) {
        super(isim);
        this.a = a;
    }

    @Override
    void alanHesapla() {
        int alan = a*a;
        System.out.println(getIsim()+ " seklinin alani: " + alan);
    }

    @Override
    void cevreHesapla() {
        int cevre = 4*a;
        System.out.println(getIsim()+ " seklinin cevres,: " + cevre);
    }
}
