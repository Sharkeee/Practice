package nauka.obiektowka;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public Manager() {
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalary() {
        double managerSalary = super.getSalary() + this.bonus;
        return managerSalary;
    }
}
