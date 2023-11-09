package ExercicioLacoIf;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = sc.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = sc.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = sc.nextInt();
		
		if ((a+b) > c) {
			System.out.println("\n" + a + " + " + b + " = " + (a+b));
			System.out.println("\n" + (a+b) + " é maior que C" + "("+ c + ")");
			
			sc.close();
			
		}
		
	}

}
