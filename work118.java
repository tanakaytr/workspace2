public class work118 {
    public static void main (String[] args) {
    	int a = 10;
        int b = 12;
        
        int c = MyMath.max(a, b);
        System.out.println(a + "と" + b + "の数値を比較すると" + c + "が大きい");
        
        int d = MyMath.min(a, b);
        System.out.println(a + "と" + b + "の数値を比較すると" + d + "が小さい");

    }
}
