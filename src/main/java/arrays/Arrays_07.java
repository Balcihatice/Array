package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_07 {
    /*
   Kullanicidan array`in Boyutunu ve elementlerini alip,
   Array`i olusturan ve bize donduren bir metod olusturunuz.
    */

    public static int[] arrayOlustur() {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugunu giriniz");
        int len = input.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array`e eklenecek elemani giriniz");

            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = arrayOlustur();

        System.out.println(Arrays.toString(arr));


    }
}


