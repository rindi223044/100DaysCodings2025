public class KonversiStringKePrimitif {
    public static void main(String[] args) {
        // Deklarasi string yang akan dikonversi
        String strInt = "123";
        String strDouble = "123.45";
        String strFloat = "123.45f";
        String strBoolean = "true";
        String strLong = "1234567890";
        String strShort = "32000";
        String strByte = "127";
        String strChar = "A";  // khusus: konversi hanya ambil karakter pertama

        // Konversi ke tipe data primitif
        int angkaInt = Integer.parseInt(strInt);
        double angkaDouble = Double.parseDouble(strDouble);
        float angkaFloat = Float.parseFloat(strFloat);
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);
        long angkaLong = Long.parseLong(strLong);
        short angkaShort = Short.parseShort(strShort);
        byte angkaByte = Byte.parseByte(strByte);
        char karakter = strChar.charAt(0); // ambil karakter pertama dari string

        // Output hasil konversi
        System.out.println("int: " + angkaInt);
        System.out.println("double: " + angkaDouble);
        System.out.println("float: " + angkaFloat);
        System.out.println("boolean: " + nilaiBoolean);
        System.out.println("long: " + angkaLong);
        System.out.println("short: " + angkaShort);
        System.out.println("byte: " + angkaByte);
        System.out.println("char: " + karakter);
    }
}
