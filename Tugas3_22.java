
import java.util.Scanner;

public class Tugas3_22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko : ");
            jumlahToko = nad.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!!!");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int barangTertinggi = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);

            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan : ");
                jumlahPelanggan = nad.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif ya. Ulangi input!!!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarang = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang;
                do {
                    System.out.print(" Jumlah barang pelanggan " + j + " : ");
                    barang = nad.nextInt();
                    if (barang < 0) {
                        System.out.println("Tidak boleh  negatif ya. Ulangi input !!!");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarang);
            totalSemua += totalBarang;

            if (totalBarang > barangTertinggi) {
                barangTertinggi = totalBarang;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko : " + totalSemua);
        System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        nad.close();

    }
}
