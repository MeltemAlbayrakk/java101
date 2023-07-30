import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//MATEMATİK FİZİK KİMYA TÜRKÇE TARİH MÜZİK


    int mat,fizik,kimya,turk,tarih,muzik,toplam,ort,ders;
    ders=0;
    toplam=0;
    Scanner input = new Scanner(System.in);
    System.out.println("lütfen matematik notunuzu girin");
    mat= input.nextInt();
        if(0<=mat || mat<=100){
            toplam= toplam+mat;
            ders++;
        }
    System.out.println("lütfen fizik notunuzu girin");
    fizik=input.nextInt();
        if(0<=fizik || fizik<=100){
            toplam= toplam+fizik;
            ders++;
        }
    System.out.println("lütfen kimya notunuzu girin");
    kimya=input.nextInt();
        if(0<=kimya || kimya<=100){
            toplam= toplam+kimya;
            ders++;
        }
    System.out.println("lütfen türkçe notunuzu girin");
    turk=input.nextInt();
        if(0<=turk || turk<=100){
            toplam= toplam+turk;
            ders++;
        }
    System.out.println("lütfen tarih notunuzu girin");
    tarih=input.nextInt();
        if(0<=tarih || tarih<=100){
            toplam= toplam+tarih;
            ders++;
        }
    System.out.println("lütfen muzik notunuzu girin");
    muzik=input.nextInt();
        if(0<=muzik || muzik<=100){
            toplam= toplam+muzik;
            ders++;
        }
    ort=(toplam)/ders;

    System.out.println("ortalamanız:");
    System.out.println(ort);
    if (ort<55){
        System.out.println("dersten kaldınız");

    }else{
        System.out.println("dersten geçtiniz");
    }

    }
}
