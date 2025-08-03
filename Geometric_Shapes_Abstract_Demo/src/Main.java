import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "Islemler...\n" +
                "1. islem: Kare alan hesapla\n" +
                "2. islem: Kare cevre hesapla\n" +
                "3. islem: Ucgen alan hesapla\n" +
                "4. islem: Ucgen cevre hesapla\n" +
                "5. islem: Daire alan hesapla\n" +
                "6. islem: Daire cevre hesapla\n" +
                "7. islem: Cikis";

        while (true) {
            System.out.println("\n" + islemler);
            System.out.print("Yapmak istediginiz islem icin 1-7 arasinda bir rakam giriniz: ");
            Sekil sekil = null;
            int rakam = scanner.nextInt();

            if (rakam == 7) {
                System.out.println("Programdan cikiliyor...");
                break;
            }

            switch (rakam) {
                case 1:
                    System.out.print("Karenin kenar uzunlugunu giriniz: ");
                    sekil = new Kare("Kare", scanner.nextInt());
                    sekil.alanHesapla();
                    break;
                case 2:
                    System.out.print("Karenin kenar uzunlugunu giriniz: ");
                    sekil = new Kare("Kare", scanner.nextInt());
                    sekil.cevreHesapla();
                    break;
                case 3:
                    System.out.println("Ucgenin 3 kenar uzunlugunu giriniz:");
                    sekil = new Ucgen("Ucgen", scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    sekil.alanHesapla();
                    break;
                case 4:
                    System.out.println("Ucgenin 3 kenar uzunlugunu giriniz:");
                    sekil = new Ucgen("Ucgen", scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    sekil.cevreHesapla();
                    break;
                case 5:
                    System.out.print("Dairenin yaricapini giriniz: ");
                    sekil = new Daire("Daire", scanner.nextInt());
                    sekil.alanHesapla();
                    break;
                case 6:
                    System.out.print("Dairenin yaricapini giriniz: ");
                    sekil = new Daire("Daire", scanner.nextInt());
                    sekil.cevreHesapla();
                    break;
                default:
                    System.out.println("Gecersiz islem. Lutfen 1 ile 7 arasinda bir sayi giriniz.");
            }
        }
    }
}
