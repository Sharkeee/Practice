import nauka.obiektowka.*;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // abstrakcyjne
        Person p = new Student("Tomasz", "Programowanie");
        Person[] people = new Person[2];
        people[0] = new Employee("Henryk", 5000, 2018, 1, 2);
        people[1] = new Student("Przemek Test", "Informatyka");

        System.out.println(people[0].getDescription());
    }



}

