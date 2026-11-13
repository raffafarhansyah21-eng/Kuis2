import java.util.Scanner;

public class Kuis18MochamadRaffaSafiiFarhansyah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pengunjung: ");
        int n = sc.nextInt();
        int totalPendapatan = 0;
        int totalUsia = 0;
        int nim2 = 52;
        int kuotaDewasa = (52 % 3) + 2;

        System.out.println("Kuota pengunjung dewasa: " + kuotaDewasa);

        for (int i = 0; i < n; i++) {
            if (i >= kuotaDewasa) {
                System.out.println("Kuota dewasa habis, pengunjung ke-" + (i + 1) + " ditolak");
                break;
            }
            System.out.print("Usia pengunjung ke-" + (i + 1) + ": ");
            int usia = sc.nextInt();
            if (usia < 1 || usia > 80) {
                System.out.println("Input tidak valid, ulangi");
                i--;
                continue;
            }

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
        System.out.println("Jumlah pengunjung yang ditolak: " + kuotaDewasa);
        System.out.println("Jumlah pengunjung anak: " + (n - (totalUsia / n)));
        System.out.println("Total pendapatan : Rp " + totalPendapatan);
        System.out.println("Rata-rata usia   : " + rataUsia + " tahun");

        sc.close();
    }
}