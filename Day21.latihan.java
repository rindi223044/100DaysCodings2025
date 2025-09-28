public class TukarNilaiKaliBagi {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Menukar nilai menggunakan perkalian dan pembagian
        a = a * b; // a = 4 * 6 = 24
        b = a / b; // b = 24 / 6 = 4  (nilai awal a)
        a = a / b; // a = 24 / 4 = 6  (nilai awal b)

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
