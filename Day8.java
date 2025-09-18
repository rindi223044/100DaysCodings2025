import java.util.Scanner;

public class PengenalanString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap Anda: ");
        String nama = input.nextLine();

        System.out.println("Halo, " + nama + "!");
        System.out.println("Jumlah karakter dalam nama: " + nama.length());
    }
}
