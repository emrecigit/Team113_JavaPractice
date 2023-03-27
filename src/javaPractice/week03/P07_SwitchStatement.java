package javaPractice.week03;

import java.util.Scanner;

public class P07_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    /*
    1-Kullanicidan bir rakam alip, rakami yaziyla yazdirin
    */
        System.out.print("Lutfen bir rakam giriniz (0 - 9) : ");
        int rakam = scan.nextInt();
        switch (rakam) {
            case 0:
                System.out.println("Girdiginiz rakam 0 olup Yazı ile Yazilisi : Sifir");
                break;
            case 1:
                System.out.println("Girdiginiz rakam 1 olup Yazı ile Yazilisi : Bir");
                break;
            case 2:
                System.out.println("Girdiginiz rakam 2 olup Yazı ile Yazilisi : Iki");
                break;
            case 3:
                System.out.println("Girdiginiz rakam 3 olup Yazı ile Yazilisi : Uc");
                break;
            case 4:
                System.out.println("Girdiginiz rakam 4 olup Yazı ile Yazilisi : Dort");
                break;
            case 5:
                System.out.println("Girdiginiz rakam 5 olup Yazı ile Yazilisi : Bes");
                break;
            case 6:
                System.out.println("Girdiginiz rakam 6 olup Yazı ile Yazilisi : Alti");
                break;
            case 7:
                System.out.println("Girdiginiz rakam 7 olup Yazı ile Yazilisi : Yedi");
                break;
            case 8:
                System.out.println("Girdiginiz rakam 8 olup Yazı ile Yazilis  : Sekiz");
                break;
            case 9:
                System.out.println("Girdiginiz rakam 9 olup Yazı ile Yazilisi  : Dokuz");
                break;
            default:
                System.out.println("Girdiginiz Rakam (0 - 9) arasinda olmalidir.Yanlis deger girdiniz.");
        }
        System.out.println("================================");
        System.out.println("================================");

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
        System.out.println("Lutfen İki basamaklı bir sayı giriniz...:");
        int sayi = scan.nextInt();
        if (sayi >= 10 && sayi <= 99) {
            int birler = sayi % 10;
            int onlar = sayi / 10;
            switch (onlar) {
                case 1:
                    System.out.print("On ");
                    break;
                case 2:
                    System.out.print("Yirmi ");
                    break;
                case 3:
                    System.out.print("Otuz ");
                    break;
                case 4:
                    System.out.print("Kırk ");
                    break;
                case 5:
                    System.out.print("Elli ");
                    break;
                case 6:
                    System.out.print("Altmış ");
                    break;
                case 7:
                    System.out.print("Yetmiş ");
                    break;
                case 8:
                    System.out.print("Seksen ");
                    break;
                case 9:
                    System.out.print("Doksan ");
                    break;
            }
            switch (birler) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("üç ");
                    break;
                case 4:
                    System.out.print("dört ");
                    break;
                case 5:
                    System.out.println("beş ");
                    break;
                case 6:
                    System.out.print("altı ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;
            }
        } else {
            System.out.println("Hatalı Giris Yaptiniz Lütfen sadece iki basamaklı sayı giriniz....");
        }
        System.out.println("");
        System.out.println("================================================");
        System.out.println("================================================");

        /*
        2- Kullanicidan ay numarasini alip ay ismini yazdiriniz
        */
        System.out.print("Lutfen adini merak ettiginiz ayin numarasini yaziniz : (1-12) ");
        int ay = scan.nextInt();
        switch (ay) {
        case 1:
            System.out.println("Girilen ay : Ocak ");
            break;
        case 2:
            System.out.println("Girilen ay : Subat");
            break;
        case 3:
            System.out.println("Girilen ay : Mart");
            break;
        case 4:
            System.out.println("Girilen ay : Nisan");
            break;
        case 5:
            System.out.println("Girilen ay : Mayis");
            break;
        case 6:
            System.out.println("Girilen ay : Haziran");
            break;
        case 7:
            System.out.println("Girilen ay : Temmuz");
            break;
        case 8:
            System.out.println("Girilen ay : Ağustos");
            break;
        case 9:
            System.out.println("Girilen ay : Eylul");
            break;
        case 10:
            System.out.println("Girilen ay : Ekim");
            break;
        case 11:
            System.out.println("Girilen ay : Kasim");
            break;
        case 12:
            System.out.println("Girilen ay : Aralik");
            break;
        default:
            System.out.println("Miladi takvimde 12 Ay vardır. geçersiz bir değer girdiniz.");
    }
        System.out.println("================================================");
        System.out.println("================================================");

        /*
        3- Kullanicidan ay numarasini alip mevsim ismini yazdiriniz
        */
        System.out.print("Lutfen adini merak ettiginiz mevsime ait ayin numarasini yaziniz : (1-12) ");
        int ayGirilen = scan.nextInt();
        switch (ayGirilen) {
            case 1: case 2: case 12:
                System.out.println("Mevsim Kis");
                break;
            case 3:    case 4:  case 5:
                System.out.println("Mevsim Ilkbahar");
                break;
            case 6:  case 7:  case 8:
                System.out.println("Mevsim Yaz");
                break;
            case 9: case 10:  case 11:
                System.out.println("Mevsim Sonbahar");
                break;
            default:
                System.out.println("Miladi takvimde 12 ay vardir.Gecersiz bir giris yaptiniz");
        }
        System.out.println("================================================");
        System.out.println("================================================");

     /*
        4- Kullanicidan yili ve ay numarasini alip o yildaki o ayda kac gun oldugunu yazdirin.
    */
        System.out.print("Bilgi istediginiz yili giriniz : ");
        int year = scan.nextInt();
        System.out.print(" Gun sayisini merak ettiginiz ayin kacinci ay oldugunu giriniz : ");
        int ayNo = scan.nextInt();
        int numdays = 0;
        switch (ayNo) {
            case 1 : case 3 : case 5 : case 7 : case 8: case 10 : case 12 :
                numdays = 31;
                System.out.println("Girdiginiz yildaki ayin gun sayisi : "+numdays);
                break;
            case 4 : case 6 : case 9 : case 11 :
                numdays = 30;
                System.out.println("Girdiginiz yildaki ayin gun sayisi : "+numdays);
                break;
            case 2 :
             numdays= (((year %4==0 && !(year%100==0)) || year%400==0) ? 29 : 28 );
                System.out.println("Girdiginiz yildaki ayin gun sayisi : "+numdays);
                break;
            default :
                System.out.println("Miladi takvimde 12 ay vardir.Gecersiz bir giris yaptiniz");
        }


    /*
      5-Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        ve girilen harfin karsiligini yazdirin.
        I : International S : Software T : Testing Q : Qualifications B: Board
     */



}
    }
