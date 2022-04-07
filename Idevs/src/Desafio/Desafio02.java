package Desafio;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0 , c = 0, b = 0;

		System.out.println("Insira o número que deseja saber os divisores:");
		n = sc.nextInt();
		c = c+ n;

		for (int a = 1; a <= n; a++) {
			System.out.println("   ")
			System.out.print(a+" ");

			for (int i = 1; i < n; i++) {
				if (a % i == 0) {
					System.out.print("  "+i);
				}
			}
		}
		sc.close();
	}
}
