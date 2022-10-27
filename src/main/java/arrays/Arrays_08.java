package arrays;

import java.util.Arrays;

public class Arrays_08 {

     /*
     Verilen bir Array`deki tum elementleri bir saga kaydirip,
     son elementi en basa alan bir method olusturunuz

      */

    public static int[] sagaKaydir(int[] arr) {

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {

            arr[i + 1] = arr[i];
        }
        arr[0] = temp;

        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9};

        arr = sagaKaydir(arr);

        System.out.println(Arrays.toString(arr));

    }
}
