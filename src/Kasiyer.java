import java.util.Scanner;

public class Kasiyer {
    private Kasa kasa = new Kasa();


    public Kasiyer() {

        kasa = new Kasa();
    }

    public Kasiyer(String isim) {

        kasa = new Kasa(isim);
    }

    // isVakti() metodu
    public void isVakti() {

        while (true) {


            Scanner giris = new Scanner(System.in);
            System.out.print("Lütfen siparişinizi giriniz (Çıkış için 5): ");
            int secim = giris.nextInt();

            if (secim == 5) {
                break;
            }

            Scanner fiyatGiriş = new Scanner(System.in);
            System.out.print("Lütfen fiyatı giriniz: ");
            double fiyat = fiyatGiriş.nextInt();

            kasa.hesapla(secim, fiyat);
        }

        kasa.fisYazdir();
    }
}
