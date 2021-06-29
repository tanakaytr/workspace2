import java.io.*;

public class work131 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int num = 0;
        try{
            line = reader.readLine();
            changeStr2Int(line);
            System.out.println(line);
        } catch (IOException ex) {
            System.out.println("入力エラーです");
        }
    }
    public static void changeStr2Int(String txt) throws NumberFormatException {
        try {
    	  int num = Integer.parseInt(txt);
        } catch (NumberFormatException ex) {
            System.out.println("数値ではありません");
        }
    }
}
