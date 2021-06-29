public class Validation2 {
    
    public static boolean isLessThan(int number, int max) throws MyException {
        if(number <= max ) {
            return true;
        } else {
            throw new MyException(max + "以下の数値ではありません");
        }
    }
}
