public class Address {
    private String number;
    private String street;
    private String city;
    private String province;
    private String postalCode;

    /**
     * This constructs and initializes an address with number, street, city, province, and postalCode.
     * @param number the number of the address
     * @param street the street of the address
     * @param city the city of the address
     * @param province the province of the address
     * @param postalCode the postal code of the address
     */
    public Address(String number, String street, String city, String province, String postalCode){
        this.number = number;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * set the new number of the address
     * @param number new number of the address
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * Returns the number of the address
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * This sets the street of the address
     * @param street the street of the address
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     * This returns the current street of the address
     * @return the current street
     */
    public String getStreet(){
        return street;
    }

    /**
     * This sets teh city of the address
     * @param city the city of the address
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This returns the current city of the address
     * @return the current city
     */
    public String getCity(){
        return city;
    }

    /**
     * sets the new province of the address
     * @param province new province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Returns the current province of the address
     * @return current province
     */
    public String getProvince() {
        return province;
    }

    /**
     * This sets the new postal code of the address
     * @param postalCode postalCode of the address
     */
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    /**
     * This returns the current postal code of the address
     * @return the postal code
     */
    public String getPostalCode(){
        return postalCode;
    }


    /**
     * Overrides the toString() method of the Object class
     */
    @Override
    public String toString(){
        return number + " " + street + " St, " + city
                + ", " + province + " " + postalCode;
    }

}
