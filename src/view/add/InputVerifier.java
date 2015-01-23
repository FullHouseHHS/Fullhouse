/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD:src/add/InputVerifier.java
package add;
=======

package view.add;
>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595:src/view/add/InputVerifier.java

/**
 *
 * @author Nick
 */
public final class InputVerifier {
<<<<<<< HEAD:src/add/InputVerifier.java

    public static boolean checkNumbers(String input) {

        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean checkLetters(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public static boolean checkEmail(String input) {
        return input.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$");
    }

    static boolean checkDate(String day, String month, String year) {

        int dayInt;
        int monthInt;
        int yearInt;

=======
    
    public static boolean checkNumbers(String input){
        
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
        
    }
    
    public static boolean checkLetters(String input){
        return input.matches("[a-zA-Z]+");
    }
    
    public static boolean checkEmail(String input){
        return input.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$");
    }

    static boolean checkDate(String day, String month, String year) {
        
        int dayInt;
        int monthInt;
        int yearInt;
        
>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595:src/view/add/InputVerifier.java
        try {
            dayInt = Integer.parseInt(day);
            monthInt = Integer.parseInt(month);
            yearInt = Integer.parseInt(year);
<<<<<<< HEAD:src/add/InputVerifier.java

            if (monthInt >= 0 && monthInt <= 12) {
                if ((yearInt % 4 == 0) && ((yearInt % 100 != 0) || (yearInt % 400 == 0))) {
                    if (dayInt >= 0 && dayInt < 29) {
                        return true;
                    }
                } else {
                    if (dayInt >= 0 && dayInt < 28) {
                        return true;
                    }
                }
            }
            
            return false;
        
        } catch (NumberFormatException e) {
            return false;
        }

    }

=======
            
            if((yearInt % 4 == 0) && ((yearInt % 100 != 0) || (yearInt % 400 == 0))){
                if (dayInt >= 0 ) {
                    
                }
            }
            
            
            
            return true;
        } catch (NumberFormatException e){
            return false;
        }
        
        
    }
    
>>>>>>> 09f592691479e89c90d22dbe830b2df8db7ae595:src/view/add/InputVerifier.java
}
