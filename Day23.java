import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang dan lebar dari user
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Menghitung luas
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi panjang adalah: " + luas);

        input.close();
    }
}
