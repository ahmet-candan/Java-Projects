public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybaldeci, int donusHızı, int saldiriGucu,String kutsalCanavar, String gizliYetenek) {
        super(beybaldeci, donusHızı, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kusalCanavarOrtayaCikar() {
        System.out.println(getBeybaldeci()+" "+kutsalCanavar+" i ortaya çıkarıyor");
        System.out.println(getBeybaldeci()+" ın saldırısı: Hayalet Kasırga ");
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Kutsal canavar adı:"+ kutsalCanavar);
        System.out.println("Gizi Yetenek :"+ gizliYetenek);
    }
}
