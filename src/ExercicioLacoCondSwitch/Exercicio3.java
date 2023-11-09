package ExercicioLacoCondSwitch;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float n1,n2;
		
		int operacao;
		
		System.out.println("\n Código 1 - Soma");
		System.out.println("\n Código 2 - Subtração");
		System.out.println("\n Código 3 - Multiplicação");
		System.out.println("\n Código 4 - Divisão");
		System.out.println("\n\nQual operação quer efetuar?");
		operacao = sc.nextInt();
		
		System.out.println("\nDigite o primeiro número da operação: ");
		n1 = sc.nextFloat();
		System.out.println("\nDigite o segundo número da operação: ");
		n2 = sc.nextFloat();
		
		switch(operacao) {
		case 1: System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		break;
		case 2: System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		break;
		case 3: System.out.println(n1 + " X " + n2 + " = " + (n1*n2));
		break;
		case 4: System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		break;
		default:System.out.println("Código da operação inválida.");	
		}
		sc.close();
	}
}
