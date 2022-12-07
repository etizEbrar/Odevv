public class Kasa {
    private double toplamSatis;
    private double gunlukKar;
    private double salataKari;
    private int tatliSayisi;
    private int salataSayisi;
    private double salataKarOrani=0.3;
    private double hamburgerKarOrani=0.25;
    private double pizzaKarOrani=0.35;
    private double tatliKarOrani=0.2;

    // Nesne kurucuları
    public Kasa() {
        toplamSatis=0;
        gunlukKar=0;
        salataKari=0;
        tatliSayisi=0;
        salataSayisi=0;
        System.out.println("Hoş geldin");
    }

    public Kasa(String isim) {
        toplamSatis=0;
        gunlukKar=0;
        salataKari=0;
        tatliSayisi=0;
        salataSayisi=0;
        System.out.println("Hoş geldin " + isim);
    }

    // hesapla() metodu
    public void hesapla(int secim, double fiyat) {
        // topSatHesapla() ve gunlukKrHesapla() metotlarını çağıralım
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }

    // topSatHesapla() metodu
    private void topSatHesapla(double fiyat) {
        // ToplamSatis değerini, girdi olarak alınan fiyat değeri ile arttırın
        toplamSatis+=fiyat;
    }

    // gunlukKrHesapla() metodu
    private void gunlukKrHesapla(int secim, double fiyat) {
        if(secim==1){
            salataKari(fiyat);

        }else if(secim==2){
            gunlukKar+=hamburgerKarOrani*fiyat;

        }else if(secim==3){
            gunlukKar+=pizzaKarOrani*fiyat;

        }
        else if(secim==4){
            gunlukKar+=tatliKarOrani*fiyat;

            tatliSayisiArttir();
        }
    }

    // salataKari() metodu
    private void salataKari(double fiyat) {
        salataKari+=salataKarOrani*fiyat;
        gunlukKar+=salataKarOrani*fiyat;
    }

    // tatliSayisiArttir() metodu
    private void tatliSayisiArttir() {
        tatliSayisi++;

    }

    // fisYazdir() metodu
    public void fisYazdir() {


        System.out.print("Toplam Satış: "+toplamSatis+"\nGünlük Kar: "+gunlukKar+"\nSalata Karı: "+salataKari+"\nTatlı Sayısı: "+tatliSayisi);
    }

}
