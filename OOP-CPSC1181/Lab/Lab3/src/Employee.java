public class Employee extends Person {
    private String office;
    private double salary;

    public Employee(){
        office = "A101";
        salary = 40000;
    }
    public Employee(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        office = "A101";
        salary = 40000;
    }

    public Employee(String name, String email, String phoneNumber, String office, double salary){
        super(name, email, phoneNumber);
        this.office = office;
        this.salary = salary;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getOffice(){
        return office;
    }

    @Override
    public String toString(){
        return "";
    }
}
