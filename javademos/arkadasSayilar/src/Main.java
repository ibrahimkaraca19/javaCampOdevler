import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İki tane sayı giriniz: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int sum = 0, sum2 = 0, remainder;
        boolean firstCase = false, secondCase = false;

        for (int i = 1; i < firstNumber; i++){
            remainder = firstNumber % i;

            if (remainder == 0){
                sum += i;

                if (sum == secondNumber){
                    firstCase = true;
                }
            }
        }

        for (int i = 1; i < secondNumber; i++){
            remainder = secondNumber % i;

            if (remainder == 0){
                sum2 += i;

                if (sum2 == firstNumber){
                    secondCase = true;
                }
            }
        }

        if (firstCase && secondCase){
            System.out.println("Girdiğiniz sayılar arkadaş sayılardır.");
        }else System.out.println("Girdiğiniz sayılar arkadaş sayılar değillerdir.");

    }
}