package BankAccount;

class BankaHesabi {
    private double bakiye; // Bakiye değişkeni kapsülleme ile saklanır

    // Para yatırma metodu
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Güncel bakiye: " + bakiye + " TL.");
        } else {
            System.out.println("Geçersiz miktar.");
        }
    }

    // Para çekme metodu
    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye + " TL.");
        } else {
            System.out.println("Geçersiz işlem. Yetersiz bakiye.");
        }
    }

    // Bakiye görüntüleme metodu
    public double getBakiye() {
        return bakiye;
    }
}