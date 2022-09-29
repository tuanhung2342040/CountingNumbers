public class Faculty extends Employee {
    private Status status;

    public Faculty(){
        status = Status.TEMPORARY;
    }

    public Faculty(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        status = Status.TEMPORARY;
    }

    public Faculty(String name, String email, String phoneNumber, String office, 
    double salary, Status status){
        super(name, email, phoneNumber, office, salary);
        this.status = status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
    public Status getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return "";
    }
}
