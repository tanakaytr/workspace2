import java.io.*;

public class work38 {
	public static void main(String[] args) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        try{
	            line = reader.readLine();
	            int i = 0;
	            
	            //ここで入力された文字を一文字ずつ表示する処理を行う
	            while(i < line.length()) {
	            	System.out.println(line.charAt(i));
	            	i++;
	            }

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	}
}