import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;

    Scanner in = new Scanner(System.in);

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
    public void setId() {
        id = nextId;
        nextId++;
    }


    public void raiseSalary(Employee pracownik, Double newSalary) {
        if (newSalary > pracownik.salary) {
            System.out.println("Czy jestes pewien ze chcesz zwiekszyc pensje pracownika " + pracownik.getName() + " o " + (newSalary - pracownik.salary));
            String answer = in.next();
            if (answer.equalsIgnoreCase("tak")) {
                pracownik.salary = newSalary;
                System.out.println("Pensja pomyslnie podwyzszona");
            } else {
                System.out.println("Pensja nie zostala podniesiona");

            }
        } else {
            System.out.println("Czy chcesz obnizyc pensje pracownika " + pracownik.getName() + " o " + (pracownik.salary - newSalary));
            String answer = in.next();
            if (answer.equalsIgnoreCase("tak")) {
                pracownik.salary = newSalary;
                System.out.println("Pensja pomyslnie obnizona");
            } else {
                System.out.println("Pensja nie zostala obnizona");

            }
        }
    }
}
