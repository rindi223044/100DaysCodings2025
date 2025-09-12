public class TipeDataNumerik {
    public static void main(String[] args) {
        // Tipe data byte (8 bit), rentang: -128 hingga 127
        byte angkaByte = 100;
        System.out.println("Nilai byte: " + angkaByte);

        // Tipe data short (16 bit), rentang: -32,768 hingga 32,767
        short angkaShort = 20000;
        System.out.println("Nilai short: " + angkaShort);

        // Tipe data int (32 bit), rentang: -2,147,483,648 hingga 2,147,483,647
        int angkaInt = 1000000000;
        System.out.println("Nilai int: " + angkaInt);

        // Tipe data long (64 bit), rentang: sangat besar
        long angkaLong = 10000000000L; // Tambahkan 'L' di akhir nilai long
        System.out.println("Nilai long: " + angkaLong);
    }
}
