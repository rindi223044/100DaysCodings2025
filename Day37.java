import java.util.Scanner; // Mengimpor class Scanner untuk input dari user

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt(); // Membaca input angka dari user

        // Mengecek apakah angka habis dibagi 2
        if (angka % 2 == 0) {
            System.out.println("Angka tersebut adalah bilangan genap.");
        } else {
            System.out.println("Angka tersebut adalah bilangan ganjil.");
        }

        input.close(); // Menutup Scanner untuk menghindari memory leak
    }
}
