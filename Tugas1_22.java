
import java.util.Scanner;

public class Tugas1_22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = nad.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(j + " "); 
               total++;
            }
           System.out.println();
        }
        System.out.print("Banyaknya angka yang telah dicetak : " + total);
        nad.close();
    }
}
