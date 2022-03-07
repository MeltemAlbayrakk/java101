import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
    int r,acı;
    double pi=3.14;
    double alan;

    Scanner input = new Scanner(System.in);
    System.out.println("yarıçap giriniz");
    r= input.nextInt();
    System.out.println("açı giriniz");
    acı= input.nextInt();
    alan=(pi * (r*r)*acı)/360;
    if(acı>360){
        System.out.println("yanlıs deger girdiniz");
    }else{
        System.out.println(alan);
    }







    }
}
