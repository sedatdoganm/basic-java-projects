import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku(){
        try {
            FileInputStream inputStream = new FileInputStream("music.mp3");
            int oku;

            while((oku = inputStream.read())!=-1){
                icerik.add(oku);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void kopyala(String dosyaIsmi){
        try {
            FileOutputStream outputStream = new FileOutputStream(dosyaIsmi);

            for(int deger: icerik){
                outputStream.write(deger);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        dosyaOku();
        kopyala("music2.mp3");
    }
}