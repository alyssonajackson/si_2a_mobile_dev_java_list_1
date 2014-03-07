import java.util.Scanner;

public class q_3_13_8 {

	public static void main(String[] args) {
		int n;
		Scanner scan;

		System.out.print("Digite um número inteiro: ");

		scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		scan.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i * j + " ");
			System.out.println();
		}

	}

}