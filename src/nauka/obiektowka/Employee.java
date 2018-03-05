package nauka.obiektowka;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    static Scanner in = new Scanner(System.in);
    private final String name;
    private double salary;
    private final LocalDate hireDay;
    private static int nextId = 1;
    private int id;

    //blok inicjalizujacy obiektu - wykona sie za kazdym razem gdy utworzymy nowy obiekjt
    {
        id = nextId;
        nextId++;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee() {
        name = "";
        salary = 0;
        hireDay = LocalDate.now();
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static void przyznajPremie(Employee pracownik, Double premia) {
        System.out.println("Planujesz wlasnie przyznac " + premia + "PLN premii pracownikowi o ID [" + pracownik.getId() + "]");
        ;
        System.out.println("Aby zatwierdzic przyznanie premii wpisz TAK");
        String answer = in.next();
        if (answer.equalsIgnoreCase("tak")) {
            pracownik.salary += premia;
            System.out.println("Premia przyznana, obecne zarobki pracownika (" + pracownik.getId() + ") wynosza " + pracownik.getSalary() + "PLN");
        } else {
            System.out.println("Przyznawanie premii anulowane");
        }

    }


}
