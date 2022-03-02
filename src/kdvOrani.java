import java.util.Scanner;

public class kdvOrani {
    public static void main(String[] args) {
        double tutar,kdv;
        Scanner input = new Scanner(System.in);
        System.out.println("tutar giriniz");
        tutar =input.nextDouble();
        kdv=tutar*18/100;
        System.out.print("kdv'niz:");
        System.out.println((kdv));
        System.out.print("kdvli fiyatınız: ");
        System.out.println(tutar+kdv);

    }

}
