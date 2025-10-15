import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Menentukan apakah bilangan positif, negatif, atau nol
        if (bilangan > 0) {
            System.out.println("Bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan negatif.");
        } else {
            System.out.println("Bilangan nol.");
        }

        input.close();
    }
}
