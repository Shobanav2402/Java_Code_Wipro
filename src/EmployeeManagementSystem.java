abstract class Employee {
    protected String name;
    protected int id;
    public Employee(String name, int id){
       this.name = name;
       this.id = id;
    }
    public abstract double calculateSalary();
    public abstract void displayDetails();
    
}

class fulltimeemployee extends Employee{
    private double monthlysalary;
    public fulltimeemployee(String name, int id,double monthlysalary){
        super(name, id);
        this.monthlysalary = monthlysalary;
    }
    public double calculateSalary(){
        return monthlysalary;
    }
    public void displayDetails(){
        System.out.println("Part-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println(("salary "+ calculateSalary()));
    }
}
class parttimeemployee extends Employee{
    private double hrsrate;
    private double hrswork;
    public parttimeemployee(String name, int id, double hrsrate,double hrswork){
        super(name, id);
        this.hrsrate = hrsrate;
        this.hrswork = hrswork;
    }
    public double calculateSalary(){
        return hrsrate * hrswork;
    }
    public void displayDetails(){
        System.out.println("Full-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println(("salary "+ calculateSalary()));
    }
}


public class EmployeeManagementSystem {
public static void main(String[] args) {
    fulltimeemployee f = new fulltimeemployee("Sara", 001, 12000);
    parttimeemployee p = new parttimeemployee("riya", 002, 80, 20);

    f.displayDetails();
    p.displayDetails();
}
}
