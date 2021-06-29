public class work12a {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 1 || j % 2 == 1) {
					System.out.print(i * j + " ");
				} else {
					System.out.println("#" + " ");
				}
			}
			System.out.println("");
		}
	}
}