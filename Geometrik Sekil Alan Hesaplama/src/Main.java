import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "\nİşlemler\n"
                        +"1-Kare Alan Hesapla\n"
                        +"2-Üçgen Alan Hesapla\n"
                        +"3-Daire Alan Hesapla\n"
                        +"Çıkış İçin q'ya Basın";

        while (true){
            System.out.println(islemler);
            System.out.println("Hangi şekilin alanını hesaplamak istiyorsunuz");
            String sekil_turu = scanner.nextLine();
            Sekil sekil= null;

            if ( sekil_turu.equals("q")){
                System.out.println("Çıkış Yapılıyor...");
                break;
            }

            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı: ");
                int kenar =scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1",kenar);
                sekil.alanHesapla();

            }

            else if (sekil_turu.equals("2")){
                System.out.print("Kenar1: ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar2: ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new ucgen("Üçgen 1",kenar1,kenar2,kenar3);
                sekil.alanHesapla();
            }

            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin yarıçapı : ");
                int yaricap =scanner.nextInt();
                scanner.nextLine();

                sekil= new Daire("Daire1",yaricap);
                sekil.alanHesapla();

            }

            else {
                System.out.println("Geçersiz İşlem");
            }
        }
    }
}
