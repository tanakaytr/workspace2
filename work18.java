import java.io.*;

public class work18 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("時間を入力してください");
			String line = reader.readLine();
			int hour = Integer.parseInt(line);
			
			if(hour >= 1 && hour <= 5) {
				System.out.println("寝ています");
			} else if(hour >= 6 && hour <= 9){
				System.out.println("おはようございます");
			} else if(hour >= 10 && hour <= 18){
				System.out.println("こんにちは");
			} else if(hour >= 19 && hour <= 22){
				System.out.println("お疲れさまでした");
			} else if(hour >= 23 && hour <= 24){
				System.out.println("おやすみなさい");
			} else {
				System.out.println("SONOTA");
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}