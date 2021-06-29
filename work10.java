public class work10 {
	public static void main(String[] args) {
		System.out.println("数字を入力してください");

		int a = new java.util.Scanner(System.in).nextInt();
		int b = new java.util.Scanner(System.in).nextInt();
		int c = new java.util.Scanner(System.in).nextInt();
		int d = new java.util.Scanner(System.in).nextInt();
		int e = new java.util.Scanner(System.in).nextInt();
		int[] data = new int[] {a, b, c, d, e};
		int f = 0;
		for(int i = 0; i < data.length; i++) {
			f += data[i];
		}
		int g = f/5;
		System.out.println(f);
		System.out.println(g);
	}
}