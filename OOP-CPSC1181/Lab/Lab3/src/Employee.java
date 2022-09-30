public class Employee extends Person {
    private String office;
    private double salary;

    /**
     * Default constructor 
     */
    public Employee(){
        office = "A101";
        salary = 40000;
    }

    /**
     * This constructs an employee with name, email, and phoneNumber
     * @param name the employee's name
     * @param email the employee's email
     * @param phoneNumber the employee's phoneNumber
     */
    public Employee(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        office = "A101";
        salary = 40000;
    }

    /**
     * This constructs an employee with name, email, phoneNumber, office, and salary
     * @param name the employee's name
     * @param email the employee's email
     * @param phoneNumber the employee's phoneNumber
     * @param office the employee's office
     * @param salary the employee's salary
     */ 
    public Employee(String name, String email, String phoneNumber, String office, double salary){
        super(name, email, phoneNumber);
        this.office = office;
        this.salary = salary;
    }

    /**
     * This sets the employee's office
     */
    public void setOffice(String office){
        this.office = office;
    }

    /**
     * This sets the employee's salary
     * @param salary
     */
    public void setSalary(double salary){
        this.salary = salary;
    }

    /**
     * This returns the employee's salary
     * @return employee's salary
     */
    public double getSalary(){
        return salary;
    }

    /**
     * This returns the employee's office
     * @return employee's office
     */
    public String getOffice(){
        return office;
    }

    /**
     * This overrides the toString() method of the Employee class
     */
    @Override
    public String toString(){
        return super.toString() + ", office:" + office + ", salary:" + salary;
    }
}
