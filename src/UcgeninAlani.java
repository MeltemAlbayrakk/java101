import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        // üçgenin uzunları alınıp işlem yaptırılıcak
        Scanner input = new Scanner(System.in);
        double a,b,c,u,alan;

        System.out.println("kenar uzunluğu giriniz");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        u=(a+b+c) /2;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);

    }
}
