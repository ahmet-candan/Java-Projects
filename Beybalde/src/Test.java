import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi Beybalde'yi üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }

            else{
                BeybladeFabrikası fabrika =new BeybladeFabrikası();

                Beyblade beyblade = fabrika.beybladeUret(islem);

                if (beyblade==null){
                    System.out.println("Lütfen geçerli bir isim girin");
                }

                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kusalCanavarOrtayaCikar();
                }

            }

        }

    }
}
