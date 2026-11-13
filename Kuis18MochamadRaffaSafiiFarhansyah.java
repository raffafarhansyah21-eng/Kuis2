import java.util.Scanner;

public class Kuis18MochamadRaffaSafiiFarhansyah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pengunjung: ");
        int n = sc.nextInt();
        int totalPendapatan = 0;
        int totalUsia = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Usia pengunjung ke-" + (i + 1) + ": ");
            int usia = sc.nextInt();

            // Harga tiket: usia di bawah 12 tahun Rp 25000, selain itu Rp 40000
            int harga;
            if (usia < 12) {
                harga = 25000;
            } else {
                harga = 40000;
            }
            totalPendapatan = harga + totalPendapatan;
            totalUsia += usia;
            System.out.println("  Harga tiket: Rp " + harga);
        }

        double rataUsia = (double) totalUsia / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pendapatan : Rp " + totalPendapatan);
        System.out.println("Rata-rata usia   : " + rataUsia + " tahun");
    }
}