import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    static Scanner in = new Scanner(System.in);
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;


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

    public void przyznajPremie(Double premia) {
        System.out.println("Planujesz wlasnie przyznac " + premia + "PLN premii pracownikowi o ID [" + this.getId()+"]");
        ;
        System.out.println("Aby zatwierdzic przyznanie premii wpisz TAK");
        String answer = in.next();
        if(answer.equalsIgnoreCase("tak")) {
            this.salary += premia;
            System.out.println("Premia przyznana, obecne zarobki pracownika ("+this.getId()+") wynosza " + this.getSalary() + "PLN");
        }
        else {
            System.out.println("Przyznawanie premii anulowane");
        }

    }
}
