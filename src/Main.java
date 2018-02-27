import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Employee dev = new Employee("Dev", 1337.0,2018,1,1);
        Employee boss = new Employee("Kijak",1980.0,2018,1,15);
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Kowalski",1500.0,2018,2,25);
        staff[1] = new Employee("Mazur",300.0,2018,1,15);
        staff[2] = new Employee();
        System.out.println(dev.getId());
        System.out.println(boss.getId());
        System.out.println(staff[2].getId());
        Employee test = new Employee(5000.0);
        System.out.println(test.getName());


    }

}

