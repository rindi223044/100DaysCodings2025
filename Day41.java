import java.util.Scanner;

public class NilaiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai kotor
        System.out.print("Masukkan nilai kotor: ");
        double nilaiKotor = input.nextDouble();

        // Input potongan
        System.out.print("Masukkan potongan: ");
        double potongan = input.nextDouble();

        // Hitung nilai bersih
        double nilaiBersih = nilaiKotor - potongan;

        // Tampilkan hasil
        System.out.println("Nilai bersih adalah: " + nilaiBersih);

        input.close();
    }
}
