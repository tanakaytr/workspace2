import java.io.*;

public class work16 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("0以上、100以下の数値を入力してください");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			
			if(n >= 0 && n <= 100) {
				System.out.println("0以上、100以下の数値です");
			} else {
				System.out.println("0以上、100以下の数値じゃあありません");
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}