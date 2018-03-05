import nauka.obiektowka.*;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Manager boss = new Manager();
        Executive nowy = new Executive("Tomasz", 500.0, 2018, 1, 15);
        Employee[] staff = new Employee[4];
        staff[0] = new Manager("Przemek Kijak", 500.0, 2018, 1, 15);
        staff[1] = new Employee("Pawel Grudzinski", 300.0, 2018, 2, 20);
        staff[2] = new Employee("Karol Krawczyk", 500.0, 2018, 2, 22);
        staff[3] = nowy;
        nowy.setBonus(500.0);
        if (staff[0] instanceof Manager) {
            boss = (Manager) staff[0];
            System.out.println("cos");
        } else {
            System.out.println("nie cos");
        }
        boss.setBonus(350.0);


        for (Employee i : staff) {
            System.out.println(i.getName() + " " + i.getSalary());
        }
        // abstrakcyjne
        Person p = new Student("Tomasz", "Programowanie");
        System.out.println(p.getDescription());

    }

}

