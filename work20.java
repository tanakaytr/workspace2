import java.io.*;

public class work20 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("おみくじをしますか [y]");
			String line = reader.readLine();
			char c = line.charAt(0);
			if(c == 'y') {
				int value = (int)(Math.random() * 6 + 1);
				switch (value) {
				case 1:
					System.out.println("大吉だ");
					break;
				case 2:
					System.out.println("忠吉だ");
					break;
				case 3:
					System.out.println("庄吉だ");
					break;
				case 4:
					System.out.println("末吉だ");
					break;
				case 5:
					System.out.println("今日");
					break;
				case 6:
					System.out.println("大京");
					break;
				default:
					System.out.println("もう一度挑戦だ");
				}
			} else {
				System.out.println("おみくじを終了します");
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {

			System.out.println("今日");
		}
	}
}