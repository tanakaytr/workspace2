import java.io.*;

public class work84 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("三角形の面積を計算します");
            System.out.println("三角形の底辺の数値を入力してください");
            String line = reader.readLine();
            System.out.println("三角形の高さを入力してください");
            String line2 = reader.readLine();
            
            int base = Integer.parseInt(line);
            int height = Integer.parseInt(line2);
            
            int area = getTraiAngleArea(base, height);
            System.out.println("三角形の面積 = " + area);
        } catch (IOException ex){
            System.out.println("エラーです");
        } catch (NumberFormatException ex) {
            System.out.println("数値ではありません");
        }
    }
    public static int getTraiAngleArea(int base, int height) {
    	return base * height / 2;
    }
}
