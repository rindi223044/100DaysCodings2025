public class PrimitifKeString {
    public static void main(String[] args) {
        // Tipe data primitif
        int angka = 42;
        double pecahan = 3.14;
        boolean status = true;

        // Cara 1: Menggunakan String.valueOf()
        String sAngka = String.valueOf(angka);
        String sPecahan = String.valueOf(pecahan);
        String sStatus = String.valueOf(status);

        // Cara 2: Menggunakan + "" (penggabungan string)
        String sAngka2 = angka + "";
        String sPecahan2 = pecahan + "";
        String sStatus2 = status + "";

        // Output
        System.out.println("Menggunakan String.valueOf():");
        System.out.println("Integer ke String: " + sAngka);
        System.out.println("Double ke String: " + sPecahan);
        System.out.println("Boolean ke String: " + sStatus);

        System.out.println("\nMenggunakan + \"\":");
        System.out.println("Integer ke String: " + sAngka2);
        System.out.println("Double ke String: " + sPecahan
