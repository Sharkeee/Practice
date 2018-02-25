import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate creatorBirth = LocalDate.of(1997, 1, 19);
        System.out.println("Chcialbym stworzyc Twoj profil pacjenta, zacznijmy od podstawowych danych");
        System.out.println("Podaj swoje imie:");
        String name = in.next();
        System.out.println("Podaj swoje nazwisko:");
        String surname = in.next();
        System.out.println("Dzien Twoich urodzin to?");
        int birthDay = in.nextInt();
        System.out.println("Miesiac Twoich urodzin:");
        int birthMonth = in.nextInt();
        System.out.println("Rok Twoich urodzin to:");
        int birthYear = in.nextInt();
        System.out.println("A wiec nazywasz sie " + name + " " + surname + ", urodziles sie " + LocalDate.of(birthYear, birthMonth, birthDay));
        System.out.println("Ja natomiast urodzilem sie w ");
        switch (creatorBirth.getMonth()) {
            case JANUARY:
                System.out.println("styczniu");
                break;
            case FEBRUARY:
                System.out.println("lutym");
                break;
            default:
                System.out.println("nie pamietam");
                break;

        }
    }

}
