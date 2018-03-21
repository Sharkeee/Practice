import nauka.obiektowka.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("List testowy",1500.0,2018,1,13));
        staff.add(new Employee("Tester listowy", 3000.0, 2018,3,15));
        staff.ensureCapacity(100);
        // abstrakcyjne
        Person p = new Student("Tomasz", "Programowanie");
        Person[] people = new Person[2];
        people[0] = new Employee("Henryk", 5000, 2018, 1, 2);
        people[1] = new Student("Przemek Test", "Informatyka");

        System.out.println(people[0].getDescription());
        System.out.println(staff.size());
    }



}

