import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
    Scanner inp= new Scanner(System.in);

    int s1,s2,islem;
    System.out.print("ilk sayıyı giriniz: ");
    s1= inp.nextInt();

    System.out.print("\n ikinci sayıyı giriniz: ");
    s2=inp.nextInt();

    System.out.println("\nişlem seçiniz:\n toplama--1\nçıkarma--2\nçarpma--3\nbölme--4");
        islem=inp.nextInt();
    switch (islem) {
        case 1:
            System.out.println(s1 + s2);
            break;
        case 2:
            System.out.println(s1 - s2);
            break;
        case 3:
            System.out.println(s1 * s2);
            break;
        case 4:
            System.out.println(s1 / s2);
            break;
        default: {
            System.out.println("hatalı tuşlama!!");
            break;
        }

    }
    }
}
