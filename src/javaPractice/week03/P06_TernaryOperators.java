package javaPractice.week03;

import java.util.Scanner;

public class P06_TernaryOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz : \n(Her girişinizde Lutfen ENTER tusuna basiniz)");
        System.out.print("1.kenar uzunlugu : ");
        int kenar1 = scan.nextInt();
        System.out.print("2.kenar uzunlugu : ");
        int kenar2 = scan.nextInt();
        System.out.print("3.kenar uzunlugu : ");
        int kenar3 = scan.nextInt();
        System.out.println(kenar1>0 ? ((kenar1 == kenar2 && kenar1 == kenar3) ? "Eskenar Ucgen." :
        "Eskenar Ucgen Degildir.") : "Yanlış Giris Yaptiniz");
        System.out.println("================================================================");
        System.out.println("================================================================");
        /*
        2- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
         */
        System.out.print("Lutfen bir harf giriniz :");
        char harf = scan.next().charAt(0);
        // char harf = scan.next.toUpperCase.charAt(0); // Bu şekilde de olabilir.Komple basta buyuk harfe cevirip
        // System.out.println("harf = " + harf); // direk yazirabiliriz.
        System.out.println(harf>=97  && harf<=122 ? (char) (harf-32) : harf);
        System.out.println(harf>='a'  && harf<='z' ? (char) (harf-32) : harf);
        System.out.println(harf>='a'  && harf<='z' ? Character.toUpperCase(harf) : harf);
        System.out.println("================================================================");
        System.out.println("================================================================");
        /*
        3- Kullanicidan iki adet sayi isteyin ve büyük olmayan sayiyi yazdirin
         */
        System.out.println("Lutfen iki sayi giriniz : ");
        System.out.print("1.sayi : ");
        double sayi1 = scan.nextDouble();
        System.out.println("2.sayi : ");
        double sayi2 = scan.nextDouble();
        System.out.println((sayi1 > sayi2 ? "Buyuk Olmayan Sayi : " + sayi2 : "Buyuk olmayan sayi : " + sayi1));


        /* Kullanicidan notunu alin 50 veya daha büyükse "Sinifi Gectin", 50'den kucukse
         "Malsef Kaldin" yazdirin.
         */
        System.out.println("Lutfen notunuzu giriniz : ");
        double not = scan.nextDouble();
        System.out.println(not>=50 ? "Sinifi " + not + " ortalaması ile gectiniz" :
                                     "Malsef "+ not+" ortalaması ile kaldiniz");
        System.out.println("================================================================");


    }

}
