import java.util.Scanner;

public class VokalChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan satu huruf: ");
        char karakter = input.next().charAt(0);
        karakter = Character.toLowerCase(karakter);

        boolean isVokal = (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u');

        System.out.println("Apakah huruf vokal? " + isVokal);
    }
}
