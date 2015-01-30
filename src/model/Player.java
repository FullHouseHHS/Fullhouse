package model;

/**
 *
 * @author CVD
 */
public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    
    private int telephoneNumber;
    private double rating;
    
    private boolean is_famous;
    private String address;
    private String city;
    private String zipCode;
    
    public Player(int id, String firstName, String lastName, int telephoneNumber,String emailAddress, double rating, boolean is_famous, String address, String city, String zipCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.rating = rating;
        this.is_famous = is_famous;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public boolean isIs_famous() {
        return is_famous;
    }

    public void setIs_famous(boolean is_famous) {
        this.is_famous = is_famous;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    @Override
    public String toString(){
        return "" + firstName + " " + lastName + "   " + address + "   " + city + "   " +  zipCode  + "   " +  telephoneNumber + "   " + emailAddress + "   " + is_famous;    
    }
    
    public String[] getInfo(){
        return new String[]{this.firstName, this.lastName, Double.toString(this.rating), this.address, this.city, this.zipCode, Integer.toString(this.telephoneNumber), this.emailAddress, Boolean.toString(this.is_famous)};
    }
    
}
