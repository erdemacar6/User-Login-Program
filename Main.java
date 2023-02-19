import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Erdem Acar";
        String sys_parola = "12345";


        System.out.println("****************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz");
        System.out.println("****************************");

        while (true){

            System.out.print("Kullanıcı adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){

                System.out.println("Sisteme hoşgediniz " + kullanici);
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parola yanlış. ");
                giris_hakki -= 1;
                System.out.println("Giriş hakkı : " + giris_hakki);

            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanıcı adı yanlış. Lütfen tekrar deneyiniz.");
                giris_hakki -= 1;
                System.out.println("Giriş hakkı : " + giris_hakki);

            }
            else {
                System.out.println("Kullanıcı adı ve parola yanlış ");
                giris_hakki -= 1;
                System.out.println("Giriş hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitmiştir.");
                break;
            }
        }

    }
}
//erdemacar6
