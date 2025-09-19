import java.util.Scanner; // Import Scanner dari library Java

public class Main {
    public static void main(String[] args) {

        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();  // Membaca input string (1 baris)

        // Input umur
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();  // Membaca input integer

        // Output hasil
        System.out.println("Halo, " + nama + "!");
        System.out.println("Umur Anda adalah: " + umur + " tahun");

        // Menutup Scanner (opsional tapi disarankan)
        input.close();
    }
}
