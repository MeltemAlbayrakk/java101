import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//MATEMATİK FİZİK KİMYA TÜRKÇE TARİH MÜZİK
    int mat,fizik,kimya,turk,tarih,muzik,ort;

    Scanner input = new Scanner(System.in);
    System.out.println("lütfen matematik notunuzu girin");
    mat= input.nextInt();

    System.out.println("lütfen fizik notunuzu girin");
    fizik=input.nextInt();

    System.out.println("lütfen kimya notunuzu girin");
    kimya=input.nextInt();

    System.out.println("lütfen türkçe notunuzu girin");
    turk=input.nextInt();

    System.out.println("lütfen tarih notunuzu girin");
    tarih=input.nextInt();

    System.out.println("lütfen muzik notunuzu girin");
    muzik=input.nextInt();

    ort=(mat+fizik+kimya+turk+tarih+muzik)/6;

    System.out.println("ortalamanız: ");
    System.out.println(ort);


    }
}
