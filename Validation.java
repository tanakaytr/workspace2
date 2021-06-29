public class Validation {
    static int lowerLimit = 1;
    static int upperLimit = 24;
    
    //必須チェック　null または空文字ならばfalse
    public static boolean isRequired (String str) {
        if(str == null || "".equals(str) ) {
            return false;
        } else {
            return true;
        }
    }
    
    // intでなければfalse
    public static boolean isInt(String str) {
        try{
            int num = Integer.parseInt(str);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }
    
    //　1以上24以内でなければfalse
    public static boolean isBetween(int num) {
        return  lowerLimit <= num && num <= upperLimit;
    }
}
