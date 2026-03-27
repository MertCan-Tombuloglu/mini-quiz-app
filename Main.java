import java.util.Scanner; // Kullanıcının klavyesini dinlemek için gereken araç

public class Main {
    public static void main(String[] args) {
        // Klavyeden girilen verileri okuyacak nesnemizi oluşturuyoruz
        Scanner klavye = new Scanner(System.in);
        
        // Ekrana ilk sorumuzu yazdırıyoruz
        System.out.println("Soru 1: Aşağıdakilerden hangisi bir programlama dilidir?");
        System.out.println("A) HTML   B) Java   C) CSS");
        System.out.print("Cevabınız: ");
        
        // Klavyeden girilen metni 'cevap' adında bir değişkenin içine alıyoruz
        String cevap = klavye.nextLine();
        
        // Şimdilik sadece sistemin cevabı doğru algılayıp algılamadığını test ediyoruz
        System.out.println("Sisteme kaydedilen cevabın: " + cevap);
    }
}
