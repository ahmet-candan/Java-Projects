public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beybaldeci, int donusHızı, int saldiriGucu,String kutsalCanavar) {
        super(beybaldeci, donusHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kusalCanavarOrtayaCikar() {
        System.out.println(getBeybaldeci()+" "+kutsalCanavar+" i ortaya çıkarıyor");
        System.out.println(getBeybaldeci()+" ın saldırısı: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı:"+ kutsalCanavar);
    }
}
