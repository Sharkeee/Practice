import nauka.obiektowka.Employee;
import nauka.obiektowka.Manager;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Manager boss = new Manager("Przemek Kijak", 1500.0,2018,2,15);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Pawel Grudzinski",300.0,2018,2,20);
        staff[2] = new Employee("Karol Krawczyk", 500.0,2018,2,22);
        boss.setBonus(350.0);

        for(Employee i : staff)
        {
            System.out.println(i.getName() + " " + i.getSalary());
        }

    }

}

