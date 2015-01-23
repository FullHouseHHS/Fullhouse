package model;

/**
 *
 * @author CVD
 */
public class Player {
    private String name;
    private String emailAddress;
    
    private int id;
    private int telephoneNumber;
    private double rating;
    
    private boolean is_famous;
<<<<<<< HEAD
    //PlayerAddresss playerAddress;
    
    public Player(String name, int telephoneNumber,String emailAddress, double rating, boolean is_famous/*, PlayerAddress playerAddress*/) {
=======
    private String adress;
    private String city;
    private String zipCode;
    
    public Player(int id, String name, int telephoneNumber,String emailAdress, double rating, boolean is_famous, String adress, String city, String zipCode) {
        this.id = id;
>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595
        this.name = name;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.rating = rating;
        this.is_famous = is_famous;
<<<<<<< HEAD
        //this.playerAddress = playerAddress;
=======

>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595
    }

    public boolean getIs_famous() {
        return is_famous;
    }

    public void setIs_famous(boolean is_famous) {
        this.is_famous = is_famous;
    }
    
    public int getId() {
        return id;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
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
    
    
    @Override
    public String toString(){
<<<<<<< HEAD
        return "" + name + "   " +  playerAddress.getCity() + "   " + playerAddress.getAddress() + "   " + playerAddress.getZipCode() + "   " + telephoneNumber + "   " + emailAddress + "   " + rating  ;    
    }*/
=======
        return "" + id + "   " + name + "   " + rating + "   " + adress + "   " + city + "   " +  zipCode + "   " + telephoneNumber + "   " + emailAdress + "   ";    
    }
>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595
    
    public String[] getInfo() {
        return new String[]{"" + id, "" + rating};
    }
}
