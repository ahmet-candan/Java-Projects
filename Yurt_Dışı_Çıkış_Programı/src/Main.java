public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökcen Hava Limanına Hoşgeldiniz");

        String sartlar = "Yurt Dışı Çıkış Kuralları \n"
                    +"1- Herhangi bir siyasi yasağınızın bulunmaması gerekir\n"
                    + "2- 15 TL harç bedeli yatırmanız gerekmektedir\n"
                    + "3- Gideceğiniz ülkeye vizenizin olması gerekir\n"
                    + "4- Yukarıdaki şartların hepsini sağlamanız gerekir";

        while (true){

            System.out.println("************************************************");
            System.out.println(sartlar);
            System.out.println("************************************************");

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(2000);

            if ( yolcu.yurtdisiHarciKontrol() == false){
                System.out.println("Şartların hepsini sağlamanız gerekmektedir");
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(2000);

            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println("Şartların hepsini sağlamanız gerekmektedir");
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(2000);

            if ( yolcu.vizeDurumuKontrol() == false){
                System.out.println("Şartların hepsini sağlamanız gerekmektedir");
                continue;
            }

            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz");
            break;

        }


    }
}
