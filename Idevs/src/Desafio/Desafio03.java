package Desafio;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		int soma = 0, i, a = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		a = sc.nextInt();

		for (i = 2; i < a; i++) {
			if (ehPrimo(i))

				if (soma < a) {
					soma = soma + i;
					if (validaprimo(soma))
						;

				}
			sc.close();
		}
	}

	private static boolean validaprimo(int primo) {
		for (int j = 2; j < primo; j++) {
			if (primo % j == 0)
				return false;

		}
		System.out.println(primo);
		return true;

	}

	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;

		}

		return true;
	}

}

