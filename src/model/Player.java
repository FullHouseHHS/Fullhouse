package model;

/**
 *
 * @author CVD
 */
public class Player {
    private String name;
    private String emailAdress;
    
    private int id;
    private int telephoneNumber;
    private double rating;
    
    private boolean is_famous;
    PlayerAdress playerAdress;
    
    public Player(int id, String name, int telephoneNumber,String emailAdress, double rating, boolean is_famous, PlayerAdress playerAdress) {
        this.id = id;
        this.name = name;
        this.emailAdress = emailAdress;
        this.telephoneNumber = telephoneNumber;
        this.rating = rating;
        this.is_famous = is_famous;
        this.playerAdress = playerAdress;
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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
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
    
    public PlayerAdress getPlayerAdress() {
        return playerAdress;
    }
    
    public void setPlayerAdress(PlayerAdress playerAdress) {
        this.playerAdress = playerAdress;
    }
    
    @Override
    public String toString(){
        return "" + id + "   " + name + "   " + rating + "   " + playerAdress.getCity() + "   " + playerAdress.getAdress() + "   " + playerAdress.getZipCode() + "   " + telephoneNumber + "   " + emailAdress + "   ";    
    }
    
    public String[] getInfo() {
        return new String[]{"" + id, "" + rating};
    }
}
