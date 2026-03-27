import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int puan = 0; 
        String cevap;
        
        System.out.println("PC Oyun Efsaneleri Mini Deneme Sınavına Hoş Geldiniz!");
        System.out.println("Toplam 10 soru, her soru 10 puandır. Başarılar!\n");
        System.out.println("--------------------------------------------------");
        
        // --- 1. SORU ---
        System.out.println("Soru 1: Assassin's Creed II oyununda, ailesinin intikamını almak için suikastçi tarikatına katılan ana karakterimiz kimdir?");
        System.out.println("A) Altaïr Ibn-La'Ahad   B) Ezio Auditore   C) Desmond Miles   D) Connor Kenway   E) Edward Kenway");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("B")) { puan += 10; }
        
        // --- 2. SORU ---
        System.out.println("\nSoru 2: Call of Duty: Modern Warfare 2'de (2009) kuru kafa desenli kar maskesiyle tanınan unutulmaz karakter hangisidir?");
        System.out.println("A) Captain Price   B) John 'Soap' MacTavish   C) Simon 'Ghost' Riley   D) Sergeant Foley   E) Vladimir Makarov");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("C")) { puan += 10; }
        
        // --- 3. SORU ---
        System.out.println("\nSoru 3: Yaptığınız seçimlerin hikayenin gidişatını değiştirdiği macera oyunlarıyla ünlenen stüdyo hangisidir?");
        System.out.println("A) Telltale Games   B) Rockstar Games   C) Ubisoft   D) Infinity Ward   E) Naughty Dog");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("A")) { puan += 10; }

        // --- 4. SORU ---
        System.out.println("\nSoru 4: PC'de Assassin's Creed gibi oyunları oynamak ve indirmek için kullanılan resmi uygulamanın adı nedir?");
        System.out.println("A) Steam   B) Xbox PC App   C) Ubisoft Connect   D) Epic Games   E) Origin");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("C")) { puan += 10; }

        // --- 5. SORU ---
        System.out.println("\nSoru 5: Windows bilgisayarlarda aylık belli bir ücretle yüzlerce oyuna erişim sağlayan Microsoft hizmeti nedir?");
        System.out.println("A) PlayStation Plus   B) PC Game Pass   C) EA Play   D) Steam Premium   E) GeForce Now");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("B")) { puan += 10; }

        // --- 6. SORU ---
        System.out.println("\nSoru 6: Assassin's Creed evreninde suikastçilerin en çok kullandığı, bileğe takılan gizli silahın genel adı nedir?");
        System.out.println("A) Hidden Blade   B) Phantom Blade   C) Hookblade   D) Throwing Knife   E) Hidden Gun");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("A")) { puan += 10; }

        // --- 7. SORU ---
        System.out.println("\nSoru 7: Call of Duty serisindeki gibi dünyayı karakterin kendi gözünden gördüğümüz oyun türüne ne ad verilir?");
        System.out.println("A) RPG   B) TPS   C) FPS   D) RTS   E) MOBA");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("C")) { puan += 10; }

        // --- 8. SORU ---
        System.out.println("\nSoru 8: Oyunları yeniden paketleyerek (repack) boyutlarını inanılmaz derecede küçültmesiyle ünlü isim kimdir?");
        System.out.println("A) Skidrow   B) FitGirl   C) Reloaded   D) Razor1911   E) Empress");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("B")) { puan += 10; }

        // --- 9. SORU ---
        System.out.println("\nSoru 9: Oyun oynarken haritaların ve kaplamaların anlık olarak tutulduğu hızlı, geçici donanım birimi hangisidir?");
        System.out.println("A) HDD   B) SSD   C) İşlemci (CPU)   D) RAM   E) Anakart");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("D")) { puan += 10; }

        // --- 10. SORU ---
        System.out.println("\nSoru 10: Telltale'in 'The Walking Dead' oyununun ilk sezonunda küçük kız Clementine'ı koruyan ana karakterimiz kimdir?");
        System.out.println("A) Rick Grimes   B) Lee Everett   C) Kenny   D) Daryl Dixon   E) Glenn Rhee");
        System.out.print("Cevabınız: ");
        cevap = klavye.nextLine();
        if (cevap.equalsIgnoreCase("B")) { puan += 10; }

        // --- TEST SONUCU VE DEĞERLENDİRME ---
        System.out.println("\n==================================================");
        System.out.println("TEST BİTTİ! TOPLAM PUANINIZ: " + puan + " / 100");
        
        System.out.print("DEĞERLENDİRME: ");
        if (puan >= 85) {
            System.out.println("Efsanevi! PC oyun dünyasına tam anlamıyla hakimsin, gerçek bir gamersın.");
        } else if (puan >= 70) {
            System.out.println("Çok iyi! Oyun kültürü konusunda oldukça sağlam bir temelin var.");
        } else if (puan >= 50) {
            System.out.println("Fena değil, ama biraz daha farklı türlerde oyun denemek fena olmaz.");
        } else {
            System.out.println("Sanırım bu oyunlardan bazılarını oynama vaktin gelmiş!");
        }
        System.out.println("==================================================");
    }
}
