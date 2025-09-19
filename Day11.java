import java.util.Scanner;

public class InputScannerDemo {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Menerima input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Menerima input umur
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        // Menampilkan hasil input
        System.out.println("\nHalo, " + nama + "!");
        System.out.println("Umur Anda adalah " + umur + " tahun.");

        // Menutup scanner
        input.close();
    }
}
