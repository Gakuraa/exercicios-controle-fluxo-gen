package ExercicioLacoIf;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		n = sc.nextInt();

		if (((n % 2) == 0) && n > 0) {
			System.out.println("\nO número " + n + " é par e positivo");
		} else if (((n % 2) == 0) && n < 0) {
			System.out.println("\nO número " + n + " é par e negativo");
		} else if (((n % 2) == 1) && n > 0) {
			System.out.println("\nO número " + n + " é ímpar e positivo");
		} else {
			System.out.println("\nO número " + n + " é ímpar e negativo");
		}
		sc.close();
	}
}
