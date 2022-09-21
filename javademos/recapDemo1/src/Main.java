public class Main {
    public static void main(String[] args) {

        int sayi1 = 31, sayi2 = 35, sayi3 = 30;

        if (sayi1 > sayi2){

            if (sayi1 > sayi3){
                System.out.println("En büyük sayı: sayi1");
            }

        } else if (sayi2 > sayi3) {

            System.out.println("En büyük sayı: sayi2");

        }else System.out.println("En büyük sayı: sayi3");


    }
}