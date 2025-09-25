public class KonversiOtomatis {
    public static void main(String[] args) {
        tunjukkan konversi otomatis (widening) dari kecil ke besar,
        

        int angkaInt = 100;        
        long angkaLong = angkaInt; 
        float angkaFloat = angkaLong; 
        double angkaDouble = angkaFloat;

 Menampilkan hasil konversi otomatis
        System.out.println("Nilai int    : " + angkaInt);
        System.out.println("Nilai long   : " + angkaLong);
        System.out.println("Nilai float  : " + angkaFloat);
        System.out.println("Nilai double : " + angkaDouble);

         int (pengecilan tipe data)
        int kecil = (int) angkaDouble; 
        System.out.println("Double ke int (manual): " + kecil);
    }
}
