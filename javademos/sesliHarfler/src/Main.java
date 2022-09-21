import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sesli bir harf giriniz (küçük harf şeklinde): ");
        char harf = input.next().charAt(0);

        char[] kalinSesli = {'a', 'ı', 'o', 'u'};
        char[] inceSesli ={'e', 'i', 'ö', 'ü'};

        for (int i =0; i < 4; i++){
            if (harf == kalinSesli[i]){
                System.out.println("Girdiğiniz harf kalın sesli bir harftir.");
            } else if (harf == inceSesli[i]) {
                System.out.println("Girdiğiniz harf ince sesli bir harftir.");
            }
        }

        //Farklı bir yol
        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Girdiğiniz harf kalın sesli bir harftir.");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Girdiğiniz harf ince sesli bir harftir.");
                break;
            default:
                System.out.println("Geçersiz bir harf girdiniz.");
        }





    }
}