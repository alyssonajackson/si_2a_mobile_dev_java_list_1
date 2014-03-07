import java.util.Scanner;

public class q_03_13_7 {

	public static void main(String[] args) {
		int n, tipo;
		Scanner scan;

		System.out.print("Digite um número inteiro: ");

		scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		scan.close();

		do {
			tipo = n % 2;

			if (tipo == 0)
				n /= 2;
			else
				n = 3 * n + 1;

			System.out.println(n);

		} while (n != 1);
	}

}
