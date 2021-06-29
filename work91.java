public class work91 {
    public static void main(String[] args) {
        // ここで　int型の配列「tens」を作成する　80, 60, 22, 50 75を代入する
        int[] tens = {80, 60, 22, 50, 75};
        for(int a: tens) {
            System.out.println(a);
        }

        int total = sum(tens);
        System.out.println("total is " + total);

        int average = average(tens);
        System.out.println("average is " + average);
    }
    
    public static int sum(int[] data) {
        // int配列dataの値をループ処理で合計する
    	int a = 0;
    	for(int i = 0; i < data.length; i++) {
    		a += data[i];
    	}
    	return a;
    }
    public static int average(int[] data) {
        // int配列dataの値をループ処理で合計して、配列のサイズで除算することで平均を算出する
    	int a = 0;
    	for(int i = 0; i < data.length; i++) {
    		a += data[i];
    	}
    	return a / data.length;
    }
}

