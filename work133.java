import java.io.*;

public class work133 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[3];
        int count = 0;
        try{
            while(true) {
                System.out.println("メッセージを入力してください");
                line[count] = reader.readLine();
                if(line[count] != null && !line[count].equals("")) {
                    System.out.println("入力した文字:" + line[count]);
                } else {
                    break;
                }
                count++;
            }
        } catch(IOException ex) {
            System.out.println("入力エラーです");
        } catch(ArrayIndexOutOfBoundsException ex) {
        	System.out.println("配列の案以外です。");
        } finally {
        	System.out.println("終了します。");
        }
    }
}
