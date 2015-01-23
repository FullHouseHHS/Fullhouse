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
    //PlayerAddresss playerAddress;
    
    public Player(String name, int telephoneNumber,String emailAddress, double rating, boolean is_famous/*, PlayerAddress playerAddress*/) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.rating = rating;
        this.is_famous = is_famous;
        //this.playerAddress = playerAddress;
    }

    public boolean isIs_famous() {
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
    /*
    @Override
    public String toString(){
        return "" + name + "   " +  playerAddress.getCity() + "   " + playerAddress.getAddress() + "   " + playerAddress.getZipCode() + "   " + telephoneNumber + "   " + emailAddress + "   " + rating  ;    
    }*/
    
    public String[] getInfo() {
        return new String[]{"" + id, "" + rating};
    }
}
