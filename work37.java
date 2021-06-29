import java.io.*;

public class work37 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try{
            while ( true ) {
                line = reader.readLine();

                // lineに「exit」が含まれていた場合while文を抜け出す
                int a = line.indexOf("exit");
                if(a != -1) {
                	System.out.println(line);
                	break;
                } else {
                System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
	}
}