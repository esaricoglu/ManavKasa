package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class ManavKasa {
    /*
    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        double akg =input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double ekg =input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double dkg =input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double mkg =input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double pkg =input.nextDouble();

        double tutar = (a*akg) + (e*ekg) + (d*dkg) + (m*mkg) + (p*pkg);

        System.out.println("Toplam Tutar :" + tutar + " TL");

    }
}
