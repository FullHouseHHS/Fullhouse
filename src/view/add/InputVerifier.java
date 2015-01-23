/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.add;

/**
 *
 * @author Nick
 */
public final class InputVerifier {
    
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
    
}
