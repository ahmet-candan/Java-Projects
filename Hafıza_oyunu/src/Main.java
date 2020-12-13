import java.util.Scanner;

public class Main {
    private static Kart[][] karts = new Kart[4][4];

    public static void main(String[] args) {


        karts[0][0] = new Kart('E');
        karts[0][1] = new Kart('A');
        karts[0][2] = new Kart('B');
        karts[0][3] = new Kart('F');
        karts[1][0] = new Kart('G');
        karts[1][1] = new Kart('A');
        karts[1][2] = new Kart('D');
        karts[1][3] = new Kart('H');
        karts[2][0] = new Kart('F');
        karts[2][1] = new Kart('C');
        karts[2][2] = new Kart('D');
        karts[2][3] = new Kart('H');
        karts[3][0] = new Kart('E');
        karts[3][1] = new Kart('G');
        karts[3][2] = new Kart('B');
        karts[3][3] = new Kart('C');


        while (oyunBittiMi() == false){
            oyunTahtasi();
            tahminEt();
        }

    }

    public static void tahminEt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Tahmin (i ve j değerlerini bir boşluklu girin):");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();

        karts[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.println("İkinci Tahmin (i ve j değerlerini bir boşluklu girin):");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();

        if (karts[i1][j1].getDeger() == karts[i2][j2].getDeger()){
            System.out.println("Doğru tahmin");
            karts[i2][j2].setTahmin(true);

        }
        else {
            System.out.println("Yanlış tahmin");
            karts[i1][j1].setTahmin(false);
        }



    }
    public static boolean oyunBittiMi(){
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (karts[i][j].isTahmin() == false){
                    return false;
                }
            }
        }
        return true;
    }


    public static void oyunTahtasi(){
        for (int i = 0; i < 4; i++) {
            System.out.println("____________________");
            for (int j = 0; j < 4; j++) {

                if (karts[i][j].isTahmin()){
                    System.out.print(" |" + karts[i][j].getDeger()+"| ");

            }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
    }
}
