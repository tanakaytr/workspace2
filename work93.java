public class work93 {
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

		for (int i = data.length - 1; i >= 0; i--) {

			System.out.println(data[i]);
		}
	}

}
