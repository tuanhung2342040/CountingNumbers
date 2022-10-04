public class Person{
    private String name;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor of the Person class
     */
    public Person(){
        name = "";
        email = "";
        phoneNumber = "";
    }

    /**
     * This constructs a person with name, email, and phoneNumber
     * @param name : name of the person
     * @param email : email of the person
     * @param phoneNumber : phoneNumber of the person
     */
    public Person(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * This changes the information of the person
     * @param name : name of the person
     * @param email : email of the person
     * @param phoneNumber : phoneNumber of the person
     */
    public void modifyInfo(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * This returns the person's name
     * @return person's name
     */
    public String getName(){
        return name;
    }

    /**
     * This return the person's email
     * @return person's email
     */
    public String getEmail(){
        return email;
    }

    /**
     * This return the person's phoneNumber
     * @return person's phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * This override the toString() of the Person class
     */
    @Override
    public String toString(){
        return "name:" + name + ", email:" + email + ", phoneNumber:" + phoneNumber;
    }
}