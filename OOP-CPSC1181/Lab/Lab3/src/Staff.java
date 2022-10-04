public class Staff extends Employee{
    private String position;

    /**
     * Default constructor creates a Staff
     */
    public Staff(){
        position = "general";
    }

    /**
     * This constructs a Staff with a name, an email, a phoneNumber
     * @param name staff's name
     * @param email staff's email
     * @param phoneNumber staff's phoneNumber
     */
    public Staff(String name, String email, String phoneNumber){
        super(name, email, phoneNumber);
        position = "general";
    }

    /**
     * This constructs a Staff with a name, an email,
     *  a phone number, an office, and a salary
     * @param name
     * @param email
     * @param phoneNumber
     * @param office
     * @param salary
     */
    public Staff(String name, String email, String phoneNumber, String office, double salary){
        super(name, email, phoneNumber, office, salary);
        position = "general";
    }

    /**
     * This sets the Position of the staff
     * @param position staff's position
     */
    public void setPosition(String position){
        this.position = position;
    }

    /**
     * This returns the staff's position 
     * @return staff's position
     */
    public String getPosition(){
        return position;
    }

    /**
     * This overrides the Employee's toString() method
     */
    @Override
    public String toString(){
        return super.toString() +  ", position:" + position;
    }
}