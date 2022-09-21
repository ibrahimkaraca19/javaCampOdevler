import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int islem;
        boolean isPrime = true;

        if (sayi < 2){
            System.out.println("Geçersiz sayı girdiniz.");
        }

        for (int i = 2; i < sayi; i++){
            islem = sayi % i;
            if (islem == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Asaldır");
        }else System.out.println("Asal değildir");

    }
}