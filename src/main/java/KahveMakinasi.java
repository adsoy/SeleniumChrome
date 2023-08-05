import java.util.Scanner;

public class KahveMakinasi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String hangiKahve;
            System.out.println("Hangi Kahveyi İstersiniz?");
            System.out.println("1.Türk kahvesi");
            System.out.println("2.Filtre Kahve");
            System.out.println("3.Espresso");
            hangiKahve = scanner.nextLine();
            if (hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
                System.out.println("Türk kahvesi hazırlanıyor...");
            } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
                System.out.println("Filtre kahve hazırlanıyor...");
            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println("Espresso hazırlanıyor...");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.");
            }
            Scanner scanner2 = new Scanner(System.in);
            String sut;
            System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
            sut = scanner2.nextLine();
            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Süt eklendi.");
            } else if (sut.equalsIgnoreCase("Hayır")) {
                System.out.println("Süt eklenmedi.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.");
            }
            Scanner scanner3 = new Scanner(System.in);
            String seker;
            int kacSeker;
            System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
            seker = scanner3.nextLine();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kaç şeker olsun?");
                kacSeker = scanner3.nextInt();
                System.out.println(kacSeker + " şeker ekleniyor.");
            } else if (seker.equalsIgnoreCase("Hayır")) {
                System.out.println("Şeker eklenmedi.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.");
            }
            Scanner scanner4 = new Scanner(System.in);
            String boyut;
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
            boyut = scanner4.nextLine();
            if (boyut.equalsIgnoreCase("Büyük Boy")) {
                System.out.println("Kahveniz büyük boy hazırlanıyor.");
            } else if (boyut.equalsIgnoreCase("Orta Boy")) {
                System.out.println("Kahveniz orta boy hazırlanıyor.");
            } else if (boyut.equalsIgnoreCase("Küçük Boy")) {
                System.out.println("Kahveniz küçük boy hazırlanıyor.");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.");
            }
            System.out.println(hangiKahve + " " +boyut +  " " +  " içime hazırdır. Afiyet olsun !!!");
        }
}