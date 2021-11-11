import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();
        int i = 1;
        int enkucuk = 999999999, enbuyuk = -999999999;
        while(i <= n)
        {
            System.out.print(i+". Sayiyi giriniz: ");
            int sayi = input.nextInt();
            if (sayi >= enbuyuk) {
                // büyükse enbuyuk e aktarır
                enbuyuk = sayi;
            }
            // aynı şekilde girilen sayının enkucuk ten
            // küçük mü oldugunu kontrol eder
            if (sayi <= enkucuk) {
                // küçükse enkucuk e aktarır
                enkucuk = sayi;
            }
            i++;
        }


        System.out.println();

        // en büyük ve en küçüğü ekrana yazdırır.
        System.out.println("En Büyük  :" + enbuyuk);
        System.out.println("En Küçük :" + enkucuk);




    }
}
