package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_01 {
    public static void main(String[] args) {
       /*
       Kullanicinin verddigi sayi array`de var mi?
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();

        int arr[] = {14, 45, 12, 2, 9};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, sayi));

        // Kullanicidan alinan sayi array`de varsa index`i return eder,
        // yoksa olmasi geren sira numarasini return eder.
    }
}
