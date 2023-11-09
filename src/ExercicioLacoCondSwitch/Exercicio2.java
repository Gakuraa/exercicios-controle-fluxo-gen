package ExercicioLacoCondSwitch;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario;
		String nome;
		int codCargo;
		
		System.out.println("Código do cargo 1 - Gerente - Percentual de reajuste: 10%");
		System.out.println("Código do cargo 2 - Vendedor - Percentual de reajuste: 7%");
		System.out.println("Código do cargo 3 - Supervisor - Percentual de reajuste: 9%");
		System.out.println("Código do cargo 4 - Motorista - Percentual de reajuste: 6%");
		System.out.println("Código do cargo 5 - Estoquista - Percentual de reajuste: 5%");
		System.out.println("Código do cargo 6 - Técnico de TI - Percentual de reajuste: 8%");
		
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Informe seu salario: ");
		salario = sc.nextFloat();
		
		System.out.println("Informe o código do seu cargo: ");
		codCargo = sc.nextInt();
		
		switch(codCargo) {
		case 1:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Gerente" + "\nSalário: " + (salario * 1.1));
		break;
		case 2:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Vendedor" + "\nSalário: " + (salario * 1.07));
		break;
		case 3:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Supervisor" + "\nSalário: " + (salario * 1.09));
		break;
		case 4:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Motorista" + "\nSalário: " + (salario * 1.06));
		break;
		case 5:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Estoquista" + "\nSalário: " + (salario * 1.05));
		break;
		case 6:	System.out.println("Nome do colaborador: " + nome + "\nCargo: Técnico de TI" + "\nSalário: " + (salario * 1.08));
		break;
		default: System.out.println("Código do cargo inválido.");
		}
		sc.close();
	}
}