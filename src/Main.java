import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj swoje imie: ");
        String name = in.nextLine();
        wyborImienia:
        if(!name.equalsIgnoreCase("przemek")) {
            System.out.println("ZLE");
            break wyborImienia;
        }
        else {
            System.out.println("Dobrze");
        }

    }
}