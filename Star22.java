
import java.util.Scanner;

public class Star22 {
   public static void main(String[] args) {
       Scanner nad = new Scanner(System.in);

       System.out.print("Masukkan nilai n = ");
       int n = nad.nextInt();

       for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
       }
       System.out.println();
       nad.close();
   } 
}
