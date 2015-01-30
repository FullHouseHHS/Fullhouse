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
    public static boolean checkNumbers(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean checkAmountOfCharacters(String input, int length) {
        return input.length() == length;
    }
    
    public static boolean checkAmountOfCharacters(String input, int minLength, int maxLength){
        return (input.length() < maxLength && input.length() > minLength);
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
        
        try {
            dayInt = Integer.parseInt(day);
            monthInt = Integer.parseInt(month);
            yearInt = Integer.parseInt(year);

            //if (monthInt >= 0 && monthInt <= 12) {
            //    if ((yearInt % 4 == 0) && ((yearInt % 100 != 0) || (yearInt % 400 == 0))) {
            //        if (dayInt >= 0 && dayInt < 29) {
            //            return true;
            //        }
            //    } else {
            //        if (dayInt >= 0 && dayInt < 28) {
            //            return true;
            //        }
            //    }
            //}
            //
            //return false;
            if(monthInt >= 1 && monthInt <= 12){
                if(monthInt == 2 && dayInt >= 1 && dayInt <= 29){
                    if((yearInt % 4 == 0) && ((yearInt % 100 != 0) || (yearInt % 400 == 0))){
                        return true;
                    } else if(dayInt >= 1 && dayInt <= 28){
                        return true;
                    } else {
                        return false;
                    }
                } else if((monthInt == 1 || monthInt == 3 || monthInt == 5 || monthInt == 7 || monthInt == 8 || monthInt == 10 || monthInt ==12) && dayInt >= 1 && dayInt <= 31){
                    return true;
                } else if((monthInt == 2 || monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11) && dayInt >= 1 && dayInt <= 30){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        
        } catch (NumberFormatException e) {
            return false;
        }

    }     
}
