package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_03 {
    public static void main(String[] args) {

    /*
    Kullanicidan aldiginiz tamsayilar ile bir Arrray olusturunuz ve bu Array`deki
    en buyuk ve en kucuk ogeler arasindaki farki yazdiriniz
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int arrayUzunlugu = scan.nextInt();

        int arr[] = new int[arrayUzunlugu];

        System.out.println("Lutfen Array elemanlarini giriniz");

        for (int i = 0; i < arrayUzunlugu; i++) {

            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int aradakiFark = arr[arr.length - 1] - arr[0];

        System.out.println("En buyuk ve en kucuk oge arasındaki fark : " + aradakiFark);

    }
}
