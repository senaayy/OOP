public class TemelGeometrikSekil {
    private String renk = "beyaz";
    private boolean dolgu;
    private java.util.Date olusturulmaTarihi;

    public TemelGeometrikSekil() {
        olusturulmaTarihi = new java.util.Date();
    }

    public TemelGeometrikSekil(String renk, boolean dolgu) {
        olusturulmaTarihi = new java.util.Date();
        this.renk = renk;
        this.dolgu = dolgu;
    }

    public String getRenk() { return renk; }
    public void setRenk(String renk) { this.renk = renk; }

    public boolean isDolgu() { return dolgu; }
    public void setDolgu(boolean dolgu) { this.dolgu = dolgu; }

    public java.util.Date getOlusturulmaTarihi() { return olusturulmaTarihi; }

    public String toString() {
        return "Olusturulma Tarihi: " + olusturulmaTarihi +
               "\nRenk: " + renk + " ve dolgu: " + dolgu;
    }
} 