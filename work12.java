import java.io.*;

public class work12 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
			System.out.println("IDを入力してください");
			String id = new java.util.Scanner(System.in).nextLine();

			System.out.println("パスワードを入力してください");
			String password = new java.util.Scanner(System.in).nextLine();

			if (id.equals("yamada") && password.equals("abc123")) {
				System.out.println("ログインしました");
			} else {
				System.out.println("ログインできません");
			}
		
	}
}