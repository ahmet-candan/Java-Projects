import java.util.Scanner;

public class Main {

    public static int [][] matris_olustur(int [][] array){
        System.out.println("Array uzunluğu : "+array[0].length);

        int [][] array2= new int[array.length][array[0].length+1];

        for (int i = 0; i < array.length; i++) {
            int satır_toplamı =0;
            for (int j = 0; j < array[0].length; j++) {
                array2[i][j] = array[i][j];
                satır_toplamı+=array[i][j];
            }
            double ortalama = satır_toplamı/array[0].length;
            int ort= (int) ortalama;
            array2[i][array[i].length] = ort;

        }
        return array2;
    }


    public static void main(String[] args) {
        System.out.println("Matris Uygulmasına Hoşgeldiz");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaça kaçlık bir matris oluşturmak istiyorsunuz? (değerleri bir boşluk bırakarak giriniz)");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int [][] array = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(i+". satır "+ j+". stündaki değeri girin:");
                array[i][j] = scanner.nextInt();
            }

        }
        int [][]yeni_dizi= matris_olustur(array);

        for (int i = 0; i < yeni_dizi.length; i++) {
            for (int j = 0; j < yeni_dizi.length; j++) {
                System.out.print(yeni_dizi[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
