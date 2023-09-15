import java.util.Scanner;

public class Daire_Projesi {
    public static void main(String[] args) {

        //değişkenleri tanımlayalim.
        int r;
        double pi = 3.14;
        double 𝛼;

// veri almak adına kodları yazalim.

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz  : ") ;
        r = inp.nextInt();


        System.out.print("Merkez Açısının Ölçüsünü Giriniz  : ");

        𝛼 = inp.nextDouble();

// verilen alan formüşünü girelim.
        double alan = (pi * (r*r) * 𝛼) / 360 ;




        System.out.println(" Daire Diliminin Alanı : " + alan );

    }
}