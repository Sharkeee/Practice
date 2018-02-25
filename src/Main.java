import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Employee boss = new Employee("Kijak",1980.0,2018,1,15);
        System.out.println(boss.getHireDay());
        boss.raiseSalary(boss, 1000.0);
    }

}

