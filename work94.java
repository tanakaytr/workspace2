public class work94 {
	public static void main(String[] args) {
		System.out.println("aの値を入力してください");
		int a = new java.util.Scanner(System.in).nextInt();

		System.out.println("bの値を入力してください");
		int b = new java.util.Scanner(System.in).nextInt();

		System.out.println("cの値を入力してください");
		int c = new java.util.Scanner(System.in).nextInt();

		System.out.println("dの値を入力してください");
		int d = new java.util.Scanner(System.in).nextInt();

		System.out.println("eの値を入力してください");
		int e = new java.util.Scanner(System.in).nextInt();

		int[] data = { a, b, c, d, e };
		
		System.out.print("偶数　：　");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + ",");
			} 
		}
		System.out.println("");
		System.out.print("奇数　：　");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + ",");
			} 
		}
	}

}
