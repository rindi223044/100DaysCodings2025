public class NestedIfExample {
    public static void main(String[] args) {
        int nilai = 85;
        String kategori = "";

        if (nilai >= 80) {
            if (nilai >= 90) {
                kategori = "A+ (Sangat Baik)";
            } else {
                kategori = "A (Baik)";
            }
        } else if (nilai >= 70) {
            kategori = "B (Cukup)";
        } else {
            kategori = "C (Kurang)";
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Kategori: " + kategori);
    }
}
