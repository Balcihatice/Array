package arrays;

public class Arrays_02 {
    public static void main(String[] args) {
        /*
        Verilen bir MultiDimensional Array`deki degerlerin toplamini bulan kodu yazalim
         */

        int[][] m = {{1, 5}, {7, 4, 8}};

        int result = 0;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                result += m[i][j];
            }
        }
        System.out.println(result);
    }
}
