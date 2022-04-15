import java.util.Scanner;

public class KullaniciAdiSifre {

    public static void main(String[] args) {
        String userName,password;
        int giris;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.print("sifre giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
          System.out.print("Giriş yaptınız..");
        }else{
            System.out.print("bilgileriniz yanlış..Şifrenizi sıfırlamak ister misiniz?  evet=1, hayır=0");
            giris=input.nextInt();
            switch(giris) {
                case 0:
                    System.out.print("iyi günler.");
                    break;
                case 1:
                    System.out.print(" yeni sifrenizi girin:" + input.nextLine());
                     String newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.print("yeni şifreniz eskisiyle eşit olamaz");
                    }
                    else{
                        System.out.print("şifreniz oluşturuldu.");
                    }
                    break;

            }

        }

    }





}

