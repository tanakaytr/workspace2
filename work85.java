import java.io.*;

public class work85 {
    public static void main(String[] args) {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("素数を判定します");
            System.out.println("数値を入力してください");
            String line = reader.readLine();
            
            int num = Integer.parseInt(line);
            
            boolean answer = isPrimeNumber(num);
            if (answer) {
                System.out.println(num + "は素数です");
            } else {
                System.out.println(num + "は素数ではありません");
            }
        } catch (IOException ex){
            System.out.println("エラーです");
        } catch (NumberFormatException ex) {
            System.out.println("数値ではありません");
        }
    }
    public static boolean isPrimeNumber(int a) {
    	boolean isPrime = true;
    	for(int i = 2; i < a; i++) {
    		if(a % i == 0) {
    			isPrime = false;
    		}
    	}
    	return isPrime;
    }
}
