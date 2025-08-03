public abstract class Sekil {
    private String isim;

    abstract void alanHesapla();
    abstract void cevreHesapla();

    public Sekil(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
}
