public class Faculty extends Employee {
    private Status status;

    /**
     * Default constructor 
     */
    public Faculty(){
        status = Status.TEMPORARY;
    }

    /**
     * This constructs a faculty with a name, an email, and a phoneNumber
     * @param name the employee's name
     * @param email the employee's email
     * @param phoneNumber the employee's phoneNumber
     */
    public Faculty(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        status = Status.TEMPORARY;
    }

    /**
     * This constructs a faculty with a name, an email, a phoneNumber, an office, a salary, and a status
     * @param name the employee's name
     * @param email the employee's name
     * @param phoneNumber the employee's phoneNumber
     * @param office the employee's office
     * @param salary the employee's salary
     * @param status the employee's status
     */
    public Faculty(String name, String email, String phoneNumber, String office, 
    double salary, Status status){
        super(name, email, phoneNumber, office, salary);
        this.status = status;
    }

    /**
     * This sets the employee's status
     * @param status employee's status
     */
    public void setStatus(Status status){
        this.status = status;
    }

    /**
     * This returns the employee's status
     * @return employee's status
     */
    public Status getStatus(){
        return status;
    }

    /**
     * This overrides the toString() method of the Employee class
     */
    @Override
    public String toString(){
        return super.toString() + ", status:" + status;
    }
}