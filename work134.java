import java.io.*;

public class work134 {
    public static void main(String[] args) throws MyException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int number;
        try{
            System.out.println("5以下の数値を入力してください");
            line = reader.readLine();
            number = Integer.parseInt(line);
            if( Validation2.isLessThan(number, 5 ) ) {
                System.out.println("入力された数値：" + number);
            }
        } catch(NumberFormatException ex) {
            System.out.println("数値ではありません");
        } catch(IOException ex) {
            System.out.println("入力エラーです");
        }
    }
}
