package javaPractice.studentPractice;

import java.util.Scanner;

public class Q01_Q_A_GuneGoreTatilHesapla {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan gun ismini girmesini isteyim
        Girilen gun hafta ici bir gun ise "Simdi calisma zamani tatile ... gun var"
        seklinde haftasonu tatiline kac gun kaldigini yazdirin
        girilen gun haftasonu ise "Simdi dinlenme zamani yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Haftanin hangi gunundeyiz (Gun Adi veya Sayisi Giriniz) : ");
        String gunAdi = scan.next().toLowerCase();

        if (gunAdi.equals("pazartesi") || gunAdi.equals("1")) {
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (gunAdi.equals("sali") || gunAdi.equals("2")) {
            System.out.println("Simdi calisma zamani tatile 4 gun var");
        } else if (gunAdi.equals("çarşamba") || gunAdi.equals("3")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");
        } else if (gunAdi.equals("perşembe") || gunAdi.equals("4")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");
        } else if (gunAdi.equals("cuma") || gunAdi.equals("5")) {
            System.out.println("Simdi calisma zamani tatile 1 gun var");
        } else if (gunAdi.equals("cumartesi") || gunAdi.equals("6")) {
            System.out.println("Simdi dinlenme zamani");
        } else if (gunAdi.equals("pazar") || gunAdi.equals("7")) {
            System.out.println("Simdi dinlenme zamani");
        } else {
            System.out.println("Gecersiz gün girdiniz");
        }
    }
}


