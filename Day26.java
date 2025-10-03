public class OperatorPenugasan {
    public static void main(String[] args) {
        int angka = 10;              // Operator '=' → memberi nilai awal 10 ke variabel angka
        System.out.println("Nilai awal: " + angka);

        angka += 5;                  // Operator '+=' → angka = angka + 5 → 10 + 5 = 15
        System.out.println("Setelah += 5: " + angka);

        angka -= 3;                  // Operator '-=' → angka = angka - 3 → 15 - 3 = 12
        System.out.println("Setelah -= 3: " + angka);

        angka *= 2;                  // Operator '*=' → angka = angka * 2 → 12 * 2 = 24
        System.out.println("Setelah *= 2: " + angka);

        angka /= 4;                  // Operator '/=' → angka = angka / 4 → 24 / 4 = 6
        System.out.println("Setelah /= 4: " + angka);

        angka %= 4;                  // Operator '%=' → angka = angka % 4 → 6 % 4 = 2
        System.out.println("Setelah %= 4: " + angka);
    }
}
