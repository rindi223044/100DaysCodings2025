public class KombinasiOperator {
    public static void main(String[] args) {
        // 1. Operator Aritmatika
        int a = 10;
        int b = 5;
        int hasil = (a + b) * 2 - 3; 
        System.out.println("Hasil operasi aritmatika: " + hasil);

        // 2. Operator Perbandingan
        boolean perbandingan = hasil > a; 
        System.out.println("Apakah hasil lebih besar dari a? " + perbandingan);

        // 3. Operator Logika
        boolean logika = (a > b) && (hasil > 20); 
        System.out.println("Apakah a lebih besar dari b DAN hasil lebih besar dari 20? " + logika);

        // 4. Operator Penugasan
        hasil += 10; // hasil = hasil + 10
        System.out.println("Nilai hasil setelah penugasan += 10: " + hasil);

        // 5. Operator Gabungan (Aritmatika + Logika)
        boolean kombinasi = ((a * b) > hasil) || (b < 10);
        System.out.println("Apakah (a*b) lebih besar dari hasil ATAU b lebih kecil dari 10? " + kombinasi);
    }
}
