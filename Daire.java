public class Daire extends TemelGeometrikSekil {
    private double yaricap;

    public Daire(String renk, boolean dolgu, double yaricap) {
        super(renk, dolgu);
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getAlan() {
        return Math.PI * yaricap * yaricap;
    }

    public double getCevre() {
        return 2 * Math.PI * yaricap;
    }

    @Override
    public String toString() {
        return "Olusturulma Tarihi: " + getOlusturulmaTarihi() +
               "\nRenk: " + getRenk() +
               " ve dolgu: " + isDolgu() +
               "\nYaricap: " + yaricap +
               "\nAlan: " + getAlan() +
               "\nCevre: " + getCevre();
    }
} 