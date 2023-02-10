import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int sayi;
        int toplanan=0;
        int artan=1;
        int toplam=0;
        

        System.out.print("Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        System.out.print(toplanan+" "+artan);

        for (int i=1; i<=sayi; i++){

            toplam = toplanan+artan;

            System.out.print(" "+toplam);



        }

    }
}
