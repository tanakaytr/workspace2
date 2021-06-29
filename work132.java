import java.util.Scanner;
import java.util.InputMismatchException;

public class work132 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("最初の数値を入力して下さい。");
			int num1 = scanner.nextInt();

			System.out.println("次の数値を入力して下さい。");
			int num2 = scanner.nextInt();

			int answer = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + answer);
		} catch (InputMismatchException ex) {
			System.out.println("数値ではありません");
		} catch (ArithmeticException ex) {
			System.out.println("入力エラーです");
		}
	}
}
