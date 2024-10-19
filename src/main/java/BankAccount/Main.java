package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        BankaHesabi hesap = new BankaHesabi();

        System.out.print("Ne kadar para yatırmak istersiniz? ");
        double yatirilan = scanner.nextDouble();
        hesap.paraYatir(yatirilan);

        System.out.print("Ne kadar para çekmek istersiniz? ");
        double cekilen = scanner.nextDouble();
        hesap.paraCek(cekilen);

        System.out.println("Son bakiye: " + hesap.getBakiye() + " TL.");
    }
}
//Kullanıcıdan yatırmak ve çekmek istediği miktar bilgisi alınır ve işlem yapılır.
// Bakiye, doğrudan erişime kapalıdır ve kontrol yapıları ile doğrulama yapılır.