package PersonelBilgileri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personel personel = new Personel();

        System.out.print("Personel ismi: ");
        String isim = scanner.nextLine();
        personel.setIsim(isim); // İsmi ayarla

        System.out.print("Personel maaşı: ");
        double maas = scanner.nextDouble();
        personel.setMaas(maas); // Maaşı ayarla

        System.out.println(personel.getIsim() + " maaşı: " + personel.getMaas() + " TL.");
    }
}
//Kullanıcıdan isim ve maaş bilgisi alınır. Maaş kontrolü yapılarak, negatif maaş girişi engellenir.
// İsme ve maaşa doğrudan erişim engellenmiştir.