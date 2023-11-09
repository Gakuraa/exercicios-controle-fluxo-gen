package ExercicioLacoIf;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean apto;
		String resposta;
		
		System.out.println("\nInforme o seu nome: ");
		nome = sc.nextLine();
		System.out.println("\nInforme a sua idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.println("\nÉ sua primeira doação de sangue? (sim/não)");
		resposta = sc.nextLine();
		
		apto = resposta.equalsIgnoreCase("sim");
		
		if((idade>18 && idade<69) && apto==true) {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		} else if((idade>=18 && idade<=69) && apto==false) {
			System.out.println("\n" + nome + " está apto para doar sangue!");		
		} else if(idade>=18 && idade<60) {
			System.out.println("\n" + nome + " está apto para doar sangue!");		
		} else {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		}
		sc.close();
	}

}
