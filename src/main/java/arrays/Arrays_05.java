package arrays;

public class Arrays_05 {
    public static void main(String[] args) {

        // str String`inde bosluk haric kac karakter kullanilmistir.

        String str = "Calis  bakalim zor Mu?";

        String arr[] = str.replace(" ", "").split("");

        System.out.println("Karakter Sayisi : " + arr.length);


    }
}
