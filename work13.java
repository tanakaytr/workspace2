import java.io.*;

public class work13 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char input;
		int value;
		try {
		while(true) {
			System.out.println("サイコロを振りますか [y/n] >");
			
			input = reader.readLine().charAt(0);
			
			if(input == 'y') {
				value = (int)(Math.random() * 6 + 1);
				System.out.println("サイコロの目は「" + value + "」");
			} else {
				System.out.println("終了します");
				break;
			}
		}
		}catch(IOException ex) {
			System.out.println("エラーです");
		}catch(Exception ex) {
			System.out.println("エラーです");
		}
	}
}