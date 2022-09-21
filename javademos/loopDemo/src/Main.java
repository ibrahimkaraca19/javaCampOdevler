public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }

        for (int a = 1; a < 10; a +=2){
            System.out.println(a);
        }

        System.out.println("For Döngüsü Bitti.");

        //While
        int i = 1;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        System.out.println("While Döngüsü Bitti.");

        //Do-While döngüsü
        int j = 28;
        do {
            System.out.println(j);
            j++;
        }while (j < 10);

        System.out.println("Do-While döngüsü bitti!");



    }
}