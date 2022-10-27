package arrays;

import java.util.Arrays;

public class Arrays_09 {

     /*
    Verilen bir arrayde en kucuk ve en buyuk elemanlari yazdiran bir method olusturunuz
     */


    public static void enBuyukEnKucukElemanYazdir(int[] arr) {

        Arrays.sort(arr);

        System.out.println("En Buyuk Eleman :" + arr[arr.length - 1]);

        System.out.println("En Kucuk Eleman :" + arr[0]);
    }

    public static void main(String[] args) {

        int[] arr = {23, 76, 45, 90, 11};

        enBuyukEnKucukElemanYazdir(arr);
    }
}
