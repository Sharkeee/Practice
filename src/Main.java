import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String imiona[] = {"Przemek", "Tomek", "Adrian", "Jan", "Kurwa", "Igor", "Szymon", "Jakub", "Pawel", "Tymon"};
        boolean correct = true;
        while (correct) {
            for (int i = 0; i < 9; i++) {
                System.out.println("Czy Twoje imie to " + imiona[i]);
                String answer = in.next();
                if (answer.equalsIgnoreCase("yes")) {
                    correct = false;
                } else {
                    correct = true;
                }
                if (correct = false) {
                    break;
                }
            }
        }
    }
}
