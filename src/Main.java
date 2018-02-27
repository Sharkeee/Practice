import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Employee boss = new Employee("Kijak",1980.0,2018,1,15);
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Grudzinski",1500.0,2018,2,25);
        staff[1] = new Employee("Mazur",300.0,2018,1,15);
        System.out.println(boss.getHireDay());
        System.out.println("Praocwnik " + staff[0].getName()+ " zarabia obecnie " + staff[0].getSalary());
        boss.raiseSalary(boss, 1000.0);
    }

}

