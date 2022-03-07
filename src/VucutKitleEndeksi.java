import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double sonuc,boy,kilo;
    System.out.print("Lütfen boyunuzu (metre cinsinde)giriniz :");
    boy=input.nextDouble();
    System.out.print("\nLütfen kilonuzu giriniz : ");
    kilo=input.nextDouble();
    sonuc=kilo/(boy*boy);
    System.out.print("\nVucüt Kitle Endeksiniz : ");
    System.out.print(sonuc);

    }
}
