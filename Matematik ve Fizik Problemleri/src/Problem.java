public class Problem {

    public static class Matematik{

        public  static void daireAlan(int yaricap){
            System.out.println("Dairenin alanı: "+ (Math.PI*yaricap*yaricap));
        }

        public  static void ucgenCevresi(int kenar1,int kenar2,int keanr3){
            System.out.println("Üçgenin Çevresi: : "+ (keanr3+kenar1+kenar1));
        }

    }

    public static class Fizik{

        public static void icCarpim(Vector vec1,Vector vec2){
            int iccarpim = vec1.getI()*vec2.getI()+ vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim() + " ile "+vec2.getIsim()+ " in iç çarpımı "+ iccarpim);
        }


    }
}
