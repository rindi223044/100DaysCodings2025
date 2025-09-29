import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        // Rumus luas persegi = sisi × sisi
        double luas = sisi * sisi;

        // Menampilkan hasil
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas);

        input.close();
    }
}
