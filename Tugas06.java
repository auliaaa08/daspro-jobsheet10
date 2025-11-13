import java.util.Scanner;
public class Tugas06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int responden = 10;
        int pertanyaan = 6;
        int[][] nilai = new int[responden][pertanyaan];
        String[] namaResponden = new String[responden];

        System.out.println("=== INPUT DATA RESPONDEN ===");
        for (int i = 0; i < responden; i++) {
            System.out.print("Masukkan nama responden ke-" + (i + 1) + ": ");
            namaResponden[i] = sc.nextLine();
        }

        System.out.println("\n=== INPUT HASIL KEPUASAN PELANGGAN ===");
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden: " + namaResponden[i]);
            for (int j = 0; j < pertanyaan; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    nilai[i][j] = sc.nextInt();
                    if (nilai[i][j] >= 1 && nilai[i][j] <= 5) {
                        break;
                    } else {
                        System.out.println("Nilai tidak valid. Silahkan masukkan nilai antara 1 hingga 5.");
                    }
                }
            }
        }

        System.out.println("=== Rata-rata tiap responden ===");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += nilai[i][j];
            }
            double rataResponden = (double) total / pertanyaan;
            System.out.printf("Rata-rata responden ke-%d: %.2f\n", (i + 1), rataResponden);
        }

        System.out.println("\n=== Rata-rata tiap pertanyaan ===");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += nilai[i][j];
            }
            double rataPertanyaan = (double) total / responden;
            System.out.printf("Rata-rata pertanyaan ke-%d: %.2f\n", (j + 1), rataPertanyaan);
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalKeseluruhan += nilai[i][j];
            }
        }
        double rataKeseluruhan = (double) totalKeseluruhan / (responden * pertanyaan);
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataKeseluruhan);

        sc.close();
    }

}