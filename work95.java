public class work95 {
	public static void main(String[] args) {
		int[][] kuku = new int[9][9];

		// kukuに九九を格納するfor文
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				kuku[i - 1][j - 1] = i * j;
			}
		}
		// kukuに格納した九九を表示するfor文
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print("");

				System.out.print(kuku[i - 1][j - 1] + " ");
			}
			System.out.println();
		}
	}
}