import java.util.Scanner;
public class BioskopWithScanner06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("===== MENU BIOSKOP =====");
            System.out.println("1. Pilih kursi");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan posisi baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan posisi kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Posisi tidak valid. Silahkan coba lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Posisi sudah terisi. Silahkan coba lagi.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Berhasil menempatkan " + nama + " di (" + baris + ", " + kolom + ").");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print((i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);                      
                            }
                            if (j < penonton[i].length - 1) {
                                System.out.print("\t");
                            }        
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    return;

                default:
                    System.out.println("Menu tidak valid. Silahkan coba lagi.");
                    break;
            }
            
            System.out.println();
        }
    }
}
