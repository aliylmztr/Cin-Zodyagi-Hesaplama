import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthYear;
        String starSign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = input.nextInt();

        if (birthYear % 12 == 0) {
            starSign = "Maymun";
        } else if (birthYear % 12 == 1) {
            starSign = "Horoz";
        } else if (birthYear % 12 == 2) {
            starSign = "Köpek";
        } else if (birthYear % 12 == 3) {
            starSign = "Domuz";
        } else if (birthYear % 12 == 4) {
            starSign = "Fare";
        } else if (birthYear % 12 == 5) {
            starSign = "Öküz";
        } else if (birthYear % 12 == 6) {
            starSign = "Kaplan";
        } else if (birthYear % 12 == 7) {
            starSign = "Tavşan";
        } else if (birthYear % 12 == 8) {
            starSign = "Ejderha";
        } else if (birthYear % 12 == 9) {
            starSign = "Yılan";
        } else if (birthYear % 12 == 10) {
            starSign = "At";
        } else if (birthYear % 12 == 11) {
            starSign = "Koyun";
        }

        System.out.print("Çin Zodyağı Burcunuz : " + starSign);
        
    }
}
