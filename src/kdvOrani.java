import java.util.Scanner;

public class kdvOrani {
    public static void main(String[] args) {
        double tutar,kdv;
        Scanner input = new Scanner(System.in);
        System.out.println("tutar giriniz");
        tutar =input.nextDouble();
        if(0<tutar && 1000>tutar){
            kdv=tutar*18/100;
            System.out.print("kdv'niz:");
            System.out.println((kdv));
            System.out.print("kdvli fiyatınız: ");
            System.out.println(tutar+kdv);
        }
        else

            kdv=tutar*8/100;
            System.out.print("kdv'niz:");
            System.out.println((kdv));
            System.out.print("kdvli fiyatınız: ");
            System.out.println(tutar+kdv);



    }

}
