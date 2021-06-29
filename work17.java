import java.io.*;

public class work17 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			System.out.println("身長(cm)を入力してください");
			line = reader.readLine();
			int height = Integer.parseInt(line);
			System.out.println("体重(kg)を入力してください");
			line = reader.readLine();
			int weight = Integer.parseInt(line);
			
			int bmi = (int)(weight / ((double) height /100 * (double) height /100));
			System.out.println("BMIは「" + bmi + "」");
			
			if(bmi < 20) {
				System.out.println("痩せ気味です");
			} else if(bmi >= 20 && bmi < 24){
				System.out.println("普通です");
			} else if(bmi >= 24 && bmi < 26){
				System.out.println("太り気味です");
			} else if(bmi <= 26){
				System.out.println("太りすぎです");
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません");
		}
	}
}