public class work11 {
	public static void main(String[] args) {
		int a = 12;
		int b = 23;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}