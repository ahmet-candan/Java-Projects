import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

    private int harc;
    private boolean siyasi_yasak;
    private boolean vize_durumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasağınız bulunuyor mu (evet/hayır): ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")){
            this.siyasi_yasak = true;
        }

        else {
            this.siyasi_yasak = false;
        }

        System.out.println("Vizeniz bulunuyor mu (Evet/hayır): ");

        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")){
            this.vize_durumu = true;
        }

        else {
            this.vize_durumu = false;
        }


    }

    @Override
    public boolean yurtdisiHarciKontrol() {

        if (this.harc<15){
            System.out.println("Lütfen yurt dışı çıkış harcını tam yatırın");
            return false;
        }

        else {
            System.out.println("Yurt dışı harcı işlemi tamam ");
            return true;
        }

    }

    @Override
    public boolean siyasiYasakKontrol() {

        if (this.siyasi_yasak == true ){
            System.out.println("Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız");
            return false;
        }

        else {
            System.out.println("Yurt dışı yasağınız bulunmuyor ");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {

        if (this.vize_durumu == true ){
            System.out.println("Vize işlemleri tamam");
            return true;
        }

        else {
            System.out.println("Vizeniz gitmek istediğiniz ülkede geçerli değildir");
            return false;
        }

    }
}
