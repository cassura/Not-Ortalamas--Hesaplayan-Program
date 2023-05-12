import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.println("fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.println("kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.println("türkçe notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.println("tarih notunuzu giriniz :");
        tarih = input.nextInt();

        System.out.println("muzik notunuzu giriniz :");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız"+sonuc);

        boolean kosul = sonuc >= 60;
        System.out.println(kosul? "Geçti":"Kaldı");





    }
}
