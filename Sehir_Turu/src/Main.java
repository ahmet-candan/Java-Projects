import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class  Main {

    public static void islemleri_bastir(){
        System.out.println("0- İşlemleri Görüntüle");
        System.out.println("1- Bir Sonraki Şehire Git");
        System.out.println("2- Bir önceki Şehire Git");
        System.out.println("3- Uygulamadan Çık");
    }

    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;

        islemleri_bastir();
        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor");
        }

        boolean cikis = false;
        boolean ileri = true;


        while (!cikis){
            System.out.println("Bir işlem seçiniz: ");

            islem = scanner.nextInt();

            switch (islem){
                case 0:
                    islemleri_bastir();
                    break;

                case 1:
                    if(!ileri){ // önceki turda geri gidildi mi
                      if (iterator.hasNext()){
                          iterator.hasNext();
                      }
                      ileri=true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Şehire gidiliyor: "+iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek Şehir Kalmadı...");
                        ileri=true;
                    }
                    break;

                case 2:

                    if (ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Şehire gidiliyor: "+ iterator.previous());
                    }
                    else {
                        System.out.println("Şehir turu başladı...");
                    }
                    break;

                case 3:
                    cikis = true;
                    System.out.println("Çıkış Yapılıyor...");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String >();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        sehirleri_turla(sehirler);
    }
}
