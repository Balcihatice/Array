package multi_dimensional_arrays;

public class Ayni_Index_Toplami {
     /*
   Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
   method() kullanarak toplamını yazdıran bir program yazın.

  */

    public static void main(String[] args) {

        int[][] arr = {{2, 3}, {6, 2, 8}, {7}};
        int[][] brr = {{3, 4, 9}, {10, 11}, {12}};

        int top = 0;

        arraySum(arr, brr,top);
    }


    public static void arraySum(int[][] arr, int[][] brr, int top){

        int toplam = 0;

        int disUzunluk = Math.min(arr.length, brr.length);

        int icUzunluk;

        for (int i = 0; i < disUzunluk; i++)
        {
            icUzunluk = Math.min(arr[i].length, brr[i].length);

            for (int j = 0; j < icUzunluk; j++){

                toplam = arr[i][j] + brr[i][j];

                System.out.println("arr[" + i + "][" + j + "] >> " + arr[i][j] + "+" + brr[i][j] + "=" + toplam);
            }
        }
    }
}
