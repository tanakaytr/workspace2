import java.io.*;

public class work9{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			System.out.println("数値1を入力してください");
			int a = new java.util.Scanner(System.in).nextInt();
			System.out.println("数値2を入力してください");
			int b = new java.util.Scanner(System.in).nextInt();
			int c = a + b;
			System.out.println(c);
		
		}catch(NumberFormatException e) {
			System.out.println("数値が正しくありません");
		}
	}
}