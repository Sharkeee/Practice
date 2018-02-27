import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Employee boss = new Employee("Kijak",1980.0,2018,1,15);
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Grudzinski",1500.0,2018,2,25);
        staff[1] = new Employee("Mazur",300.0,2018,1,15);


        boss.setId();
        staff[0].setId();
        staff[1].setId();
        System.out.println(boss.getId());
        System.out.println(staff[0].getId());
        System.out.println(staff[1].getId());
        System.out.println(Employee.getNextId());
    }

}

