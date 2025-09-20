import java.util.Scanner;

public class BiodataSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String nama, alamat, jenisKelamin;
        int umur;

        // Input data dari pengguna
        System.out.println("=== Program Biodata Sederhana ===");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        jenisKelamin = input.nextLine();

        System.out.print("Masukkan Umur: ");
        umur = input.nextInt();

        // Menampilkan biodata
        System.out.println("\n=== Biodata ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Jenis Kelamin : " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur          : " + umur + " tahun");
        
        input.close();
    }
}
