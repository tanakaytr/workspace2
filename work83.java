import java.io.*;

public class work83 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("1番目の数値を入力してください");
            String num1 = reader.readLine();
            System.out.println("2番目の数値を入力してください");
            String num2 = reader.readLine();
            
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            
            int c = getMaxValue(a, b);
            System.out.println("Max value = " + c);
            
            int d = getMinValue(a, b);
            System.out.println("Min value = " + d);
        } catch (IOException ex){
            System.out.println("エラーです");
        } catch (NumberFormatException ex) {
            System.out.println("数値ではありません");
        }
    }
    public static int getMaxValue(int a, int b) {
    	if(a < b) {
    		return b;
    	} else {
    		return a;
    	}
    }
    public static int getMinValue(int a, int b) {
    	if(a > b) {
    		return b;
    	} else {
    		return a;
    	}
    }
}
