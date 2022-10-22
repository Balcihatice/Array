package arrays;

public class Arrays_04 {

    public static void main(String[] args) {

        //String de kac tane "e" var

        String str = "Erteleyen her zaman kaybeder";

        String word[] = str.split("");

        int counter = 0;

        for (int i = 0; i < word.length; i++) {

            if (word[i].equals("e")) {

                counter++;
            }
        }
        System.out.println("Sorulan karakter`in sayisi: " + counter);


    }
}
