import java.io.*;
import java.util.Scanner;

public class Main {

    public static String harfNotuHesapla(String isim, int vizeNotu1, int vizeNotu2, int finalNotu) {

        String cikti = "";
        double toplamNot = (vizeNotu1 * 0.3) + (vizeNotu2 * 0.3) + (finalNotu * 0.4);

        if (toplamNot >= 90) {
            cikti = isim + " bu dersten AA aldı";
        } else if (toplamNot >= 85) {
            cikti = isim + " bu dersten BA aldı";
        } else if (toplamNot >= 80) {
            cikti = isim + " bu dersten BB aldı";
        } else if (toplamNot >= 75) {
            cikti = isim + " bu dersten CB aldı";
        } else if (toplamNot >= 70) {
            cikti = isim + " bu dersten CC aldı";
        } else if (toplamNot >= 65) {
            cikti = isim + " bu dersten DC aldı";
        } else if (toplamNot >= 60) {
            cikti = isim + " bu dersten DD aldı";
        } else if (toplamNot >= 50) {
            cikti = isim + " bu dersten FD aldı";
        } else {
            cikti = isim + " bu dersten FF aldı";
        }

        return cikti;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("dosya98.txt")); // dosya98.txt: ogranilerin adlarini, vize1, vize2 ve final notlarini iceren .txt dosyasi.
            FileWriter writer = new FileWriter("harfNotlari.txt")) {
            while(scanner.hasNextLine()) {
                String ogrenciBilgiler = scanner.nextLine();
                String[] ogrenciArray =  ogrenciBilgiler.split(",");

                int vizeNotu1 = Integer.valueOf(ogrenciArray[1].trim()); // .trim ile gereksiz bosluklari temizledik.
                int vizeNotu2 = Integer.valueOf(ogrenciArray[2].trim());
                int finalNotu = Integer.valueOf(ogrenciArray[3].trim());

                String cikti = harfNotuHesapla(ogrenciArray[0], vizeNotu1, vizeNotu2, finalNotu);
                writer.write(cikti+ "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
