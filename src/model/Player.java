package model;

/**
 *
 * @author CVD
 */
public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String emailAddress;
    private String telephoneNumber;
    
    private double rating;    
    private boolean famous;

    
    public Player(int id, String firstName, String lastName, String address, String zipCode, String city, String emailAddress, String telephoneNumber, double rating, boolean famous) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.rating = rating;
        this.famous = famous;
    }

    public int getId() {
        return id;
    }

    public boolean isfamous() {
        return famous;
    }

    public void setFamous(boolean famous) {
        this.famous = famous;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
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
        return "" + firstName + " " + lastName + "   " + address + "   " + zipCode + "   " +  city  + "   " +  emailAddress + "   " + telephoneNumber + "   " + rating + "   " + famous;    
    }
    
    public String[] getInfo(){
        return new String[]{this.firstName, this.lastName, this.address, this.zipCode, this.city, this.emailAddress, this.telephoneNumber, Double.toString(this.rating), Boolean.toString(this.famous)};
    }
    
}
