import java.io.*;

public class work39 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String id;
        String password;
        try{
            System.out.println("IDを入力してください");
            id = reader.readLine();
            System.out.println("パスワードを入力してください");
            password = reader.readLine();
            
            //入力されたIDとパスワードが正しいかどうかを判定する処理を作成する
            if(id.equals("yamada") && password.equals("abc123")) {
            	System.out.println("ログインしました");
            } else {
            	System.out.println("ログインに失敗");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

	}
}