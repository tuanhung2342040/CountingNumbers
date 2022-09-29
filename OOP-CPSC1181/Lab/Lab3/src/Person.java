public class Person{
    private String name;
    private String email;
    private String phoneNumber;

    public Person(){
        name = "";
        email = "";
        phoneNumber = "";
    }

    public Person(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void modifyInfo(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "";
    }
}