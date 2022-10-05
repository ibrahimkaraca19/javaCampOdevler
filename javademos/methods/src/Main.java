import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        sayiBulmaca();


    }

    public static void sayiBulmaca(){

        Scanner input = new Scanner(System.in);
        System.out.print("Bir rakam giriniz: ");
        int number = input.nextInt();
        boolean isInclude = false;

        int[] sayilar = {1,2,3,4,5,6,7,8,9,0};

        for (int j : sayilar) {

            if (j == number) {
                isInclude = true;
                break;
            }
        }

        if (isInclude){
            mesajVer(number);
        }else System.out.println("Yanlış değer girdiniz.");

    }

    public static void mesajVer(int number){
        System.out.println("Sayı mevcuttur:" + number);
    }

}