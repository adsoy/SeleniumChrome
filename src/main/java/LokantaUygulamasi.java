import java.util.Scanner;

public class LokantaUygulamasi {
    public static void main(String[] args) {
        String[] corbalar = {"Mercimek Çorbası", "İşkembe Çorbası", "Ezogelin Çorbası"};
        String[] anaYemekler = {"Hünkar Beğendi", "Kuru Fasulye", "Köfte"};
        String[] pilavlar = {"Pirinç Pilavı", "Bulgur Pilavı"};
        String[] tatlilar = {"Baklava", "Kazandibi", "Kadayıf", "Tavuk Göğsü"};

        System.out.println("Lokanta Menüsü");
        System.out.println("========================");
        System.out.println("Çorbalar:");
        for (int i = 0; i < corbalar.length; i++) {
            System.out.println("\t\t" + corbalar[i]);
        }
        System.out.println("Ana Yemekler:");
        for (int i = 0; i < anaYemekler.length; i++) {
            System.out.println("\t\t" + anaYemekler[i]);
        }
        System.out.println("Pilavlar:");
        for (int i = 0; i < pilavlar.length; i++) {
            System.out.println("\t\t" + pilavlar[i]);
        }
        System.out.println("Tatlılar:");
        for (int i = 0; i < tatlilar.length; i++) {
            System.out.println("\t\t" + tatlilar[i]);
                }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Çorba seçimi yapınız: ");
        String corbaSecimi = scanner.nextLine();
        int corbaFiyati = 0;
        switch (corbaSecimi) {
            case "Mercimek Çorbası":
                corbaFiyati = 25;
                break;
            case "İşkembe Çorbası":
                corbaFiyati = 30;
                break;
            case "Ezogelin Çorbası":
                corbaFiyati = 35;
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız.");
                return;
        }
        System.out.printf("%s seçtiniz. Fiyatı: %d TL\n", corbaSecimi, corbaFiyati);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ana Yemek seçimi yapınız: ");
        String anaYemekSecimi = scanner2.nextLine();
        int anaYemekFiyati = 0;
        switch (anaYemekSecimi) {
            case "Hünkar Beğendi":
                anaYemekFiyati = 75;
                break;
            case "Kuru Fasulye":
                anaYemekFiyati = 60;
                break;
            case "Köfte":
                anaYemekFiyati = 80;
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız.");
                return;
        }
        System.out.printf("%s seçtiniz. Fiyatı: %d TL\n", anaYemekSecimi, anaYemekFiyati);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Pilav seçimi yapınız: ");
        String pilavSecimi = scanner3.nextLine();
        int pilavFiyati = 0;
        switch (pilavSecimi) {
            case "Pirinç Pilavı":
                pilavFiyati = 40;
                break;
            case "Bulgur Pilavı":
                pilavFiyati = 30;
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız.");
                return;
        }
        System.out.printf("%s seçtiniz. Fiyatı: %d TL\n", pilavSecimi, pilavFiyati);

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Tatlı seçimi yapınız: ");
        String tatliSecimi = scanner4.nextLine();
        int tatliFiyati = 0;
        switch (tatliSecimi) {
            case "Baklava":
                 tatliFiyati= 100;
                break;
            case "Tavuk Göğsü":
                 tatliFiyati= 80;
                break;
            case "Kazandibi":
                tatliFiyati= 60;
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız.");
                return;
        }
        System.out.printf("%s seçtiniz. Fiyatı: %d TL\n", tatliSecimi,tatliFiyati );

        int menuToplam=0;
        menuToplam=corbaFiyati+anaYemekFiyati+pilavFiyati+tatliFiyati;
        System.out.println(corbaSecimi+" "+corbaFiyati+" TL "+anaYemekSecimi+" "+anaYemekFiyati+" TL "+pilavSecimi+"  "+pilavFiyati+" TL "+tatliSecimi+"  "+tatliFiyati+" TL "+"TOPLAM FIYAT :"+menuToplam);
        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz");
    }

        }

