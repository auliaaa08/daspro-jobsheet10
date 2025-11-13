import java.util.Scanner;
public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkuliah = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata nilai " + (i + 1) + ": " + totalPerSiswa / jumlahMatkuliah);
        }
        System.out.println("\n================================================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < jumlahMatkuliah; j++) {
            double totalPerMatkuliah = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkuliah += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkuliah / jumlahMahasiswa);
        }
    }
}
