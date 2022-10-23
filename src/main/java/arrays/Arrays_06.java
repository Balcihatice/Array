package arrays;

import java.util.Arrays;

public class Arrays_06 {

    //Verilen Array elemanlarini tersten yazdiran kodu olusturunuz.

    public static void main(String[] args) {

        int arr[] = {9, 14, 56, 23};

        System.out.println(Arrays.toString(arr));//[9, 11, 15]

        int newArr[] = new int[arr.length];

        int idx = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            newArr[idx] = arr[i];

            idx++;
        }

        System.out.println(Arrays.toString(newArr));
    }

}

