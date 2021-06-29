import java.io.*;

public class work22 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("今日は何曜日ですか？");
			String line = reader.readLine();
			
				switch (line) {
				case "日曜日":
					System.out.println("日曜日は市場へ出かけ、糸と絹を買ってきた");
					break;
				case "月曜日":
					System.out.println("月曜日はお風呂を焚いて");
					break;
				case "火曜日":
					System.out.println("火曜日はお風呂に入り");
					break;
				case "水曜日":
					System.out.println("水曜日は友達が来て");
					break;
				case "木曜日":
					System.out.println("木曜日は送っていった");
					break;
				case "金曜日":
					System.out.println("金曜日は糸巻きもせず");
					break;
				case "土曜日":
					System.out.println("土曜日はおしゃべりばかり");
					break;
				default:
					System.out.println("そんな曜日ないです");
				}
			

		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {

			System.out.println("今日");
		}
	}
}