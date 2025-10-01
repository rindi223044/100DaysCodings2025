import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Rumus luas lingkaran = π * r * r
        double luas = Math.PI * r * r;

        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luas);

        input.close();
    }
}
