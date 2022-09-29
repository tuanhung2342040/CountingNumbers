public class Staff extends Employee{
    private String position;

    public Staff(){
        position = "general";
    }

    public Staff(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        position = "general";
    }

    public Staff(String name, String email, String phoneNumber, String office, double salary){
        super(name, email, phoneNumber, office, salary);
        position = "general";
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public String toString(){
        return "";
    }
}
