import java.io.*;

public class work21 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("数学は５段階評価でいくつですか？");
			String line = reader.readLine();
			int grade = Integer.parseInt(line);
			
				switch (grade) {
				case 1:
					System.out.println("もっと頑張りましょう");
					break;
				case 2:
					System.out.println("あと少しです");
					break;
				case 3:
					System.out.println("あと少し");
					break;
				case 4:
					System.out.println("よくできました");
					break;
				case 5:
					System.out.println("たいへんよくできました");
					break;
				default:
					System.out.println("1~5でもう一度挑戦だ");
				}
			

		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {

			System.out.println("今日");
		}
	}
}