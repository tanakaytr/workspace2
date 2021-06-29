public class Validation3 {
    static boolean isRequired(String txt) {
        if(txt == null || txt.equals("")) {
            return false;
        } else {
            return true;
        }
    }
    
    static boolean isNumeric(String txt) {
        try{
            int num = Integer.parseInt(txt);
            return true;
         } catch(NumberFormatException ex) {
            return false;
         }
    }
}