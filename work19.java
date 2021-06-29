import java.io.*;

public class work19 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("日本で一番高い山は何でしょう？");
			System.out.println("1　筑波山");
			System.out.println("２　剣だけ");
			System.out.println("３　富士山");
			System.out.println("４　阿蘇山");
			System.out.println("上記じゃあない");
			String line = reader.readLine();
			int c = Integer.parseInt(line);
			
			switch(c) {
			case 1:
				System.out.println("間違いです。筑波山じゃあない");
				break;
			case 2:
				System.out.println("間違いです。剣だけじゃあない");
				break;
			case 3:
				System.out.println("正解じゃあないか");
				break;
			case 4:
				System.out.println("間違いです。阿蘇山じゃあない");
				break;
			case 5:
				System.out.println("間違いです。1~4のどれかだ");
				break;
			default:
				System.out.println("もう一度挑戦だ");
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}