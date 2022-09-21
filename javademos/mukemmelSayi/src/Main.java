import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int sum = 0, remainder;
        boolean isPerfect = false;

        for (int i = 1; i < number; i++){

            remainder = number % i;

            if (remainder == 0){
                sum += i;

                if (sum == number){
                    isPerfect = true;
                }

            }

        }

        if (isPerfect == true){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        }else System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");

    }
}