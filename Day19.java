public class KonversiManual {
    public static void main(String[] args) {
        // Konversi dari tipe besar ke kecil
        double angkaDouble = 123.456;
        int angkaInt = (int) angkaDouble; // Manual casting
        short angkaShort = (short) angkaInt;
        byte angkaByte = (byte) angkaShort;
        
        System.out.println("Double: " + angkaDouble);
        System.out.println("int: " + angkaInt);     // Bagian desimal hilang
        System.out.println("short: " + angkaShort);
        System.out.println("byte: " + angkaByte);
        
        // Contoh kehilangan data (data loss)
        double besar = 50000.99;
        byte kecil = (byte) besar; // Akan terjadi overflow
        System.out.println("\nDouble besar: " + besar);
        System.out.println("Byte kecil: " + kecil); // Hasil tidak sesuai
    }
}
