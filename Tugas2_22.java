
import java.util.Scanner;

public class Tugas2_22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = nad.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                total += hasil;
            }
            System.out.println();
        }
        System.out.print("Jumlah seluruh angka : " + total);
        nad.close();
    }
}
