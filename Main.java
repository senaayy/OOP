public class Main {
    public static void main(String[] args) {
        // TemelGeometrikSekil sınıfından bir nesne oluşturma
        TemelGeometrikSekil sekil1 = new TemelGeometrikSekil("siyah", false);
        System.out.println("Temel Geometrik Şekil Bilgileri:");
        System.out.println(sekil1.toString());
        System.out.println("------------------------");

        // Daire sınıfından bir nesne oluşturma
        Daire daire1 = new Daire("kırmızı", true, 5.0);
        System.out.println("Daire Bilgileri:");
        System.out.println(daire1.toString());
        System.out.println("------------------------");

        // Daire nesnesinin özelliklerini değiştirme ve tekrar yazdırma
        daire1.setRenk("mavi");
        daire1.setDolgu(false);
        daire1.setYaricap(7.5);
        System.out.println("Güncellenmiş Daire Bilgileri:");
        System.out.println(daire1.toString());
        System.out.println("------------------------");
    }
} 