public class Beyblade {
    private String beybaldeci;
    private int donusHızı;
    private int saldiriGucu;

    public Beyblade(String beybaldeci, int donusHızı, int saldiriGucu) {
        this.beybaldeci = beybaldeci;
        this.donusHızı = donusHızı;
        this.saldiriGucu = saldiriGucu;
    }

    public void saldir(){
        System.out.println(beybaldeci+" "+ saldiriGucu+" ve "+donusHızı+" ile saldırıyor.");
    }

    public void kusalCanavarOrtayaCikar(){
        System.out.println("Bu Bayblade'nin kutsal canavarı bulunmuyor...");
    }

    public void bilgileriGoster(){
        System.out.println("Baeybaladeci İsmi : "+ beybaldeci);
        System.out.println("Saldırı Gücü : "+ saldiriGucu);
        System.out.println("Dönüş Hızı : "+ donusHızı);

    }

    public String getBeybaldeci() {
        return beybaldeci;
    }

    public void setBeybaldeci(String beybaldeci) {
        this.beybaldeci = beybaldeci;
    }

    public int getDonusHızı() {
        return donusHızı;
    }

    public void setDonusHızı(int donusHızı) {
        this.donusHızı = donusHızı;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
}
