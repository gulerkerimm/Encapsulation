package PersonelBilgileri;



class Personel {
    private String isim;  // Personelin ismi
    private double maas;  // Maaş değişkeni

    // İsmi ayarlayan metot
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    // Maaşı ayarlayan metot
    public void setMaas(double maas) {
        if (maas > 0) {
            this.maas = maas;
        } else {
            System.out.println("Geçersiz maaş.");
        }
    }

    public double getMaas() {
        return maas;
    }
}