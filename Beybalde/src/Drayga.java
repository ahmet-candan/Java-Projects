public class Drayga extends Beyblade{

    private String kutsalCanavar;

    public Drayga(String beybaldeci, int donusHızı, int saldiriGucu,String kutsalCanavar) {
        super(beybaldeci, donusHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kusalCanavarOrtayaCikar() {
        System.out.println(getBeybaldeci()+" "+kutsalCanavar+" i ortaya çıkarıyor");
        System.out.println(getBeybaldeci()+" ın saldırısı: Kaplan Pençesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı:"+ kutsalCanavar);
    }
}
