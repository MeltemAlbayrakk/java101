import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
    // tksimetre km basına 2.20 alıyor.min tutar 20 tl 20 tl altında ise yine 20.taksimetre acılıs ucretı 10tl.
        double mesafe,ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("gidilen mesafe");
        mesafe= input.nextDouble();
        ucret=10+(mesafe*2.20);

        if(ucret<20){
            ucret=20;
        }

        System.out.println(ucret);


    }
}
