package ExercicioLacoCondSwitch;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float saldo = 1000;
		int codOp;
		float deposito,saque;
		
		System.out.println("Bem vindo ao Generation Bank");
		System.out.println("\nCódigo da operação 1 - SALDO");
		System.out.println("\nCódigo da operação 2 - SAQUE");
		System.out.println("\nCódigo da operação 3 - DEPÓSITO");
		
		System.out.println("\n\nDigite o código da operação que quer realizar: ");
		codOp = sc.nextInt();
		
		switch(codOp) {
		case 1 : System.out.println("\nSaldo: " + saldo);
		break;
		case 2 : System.out.println("\nInforme o valor do saque: ");
		saque = sc.nextFloat();
		if(saque>0 && saque<saldo) {
			System.out.println("\nOperação - Saque" + "\nNovo Saldo: " + (saldo - saque) + "\nR$" +saque + " Sacados com sucesso.");
		} else if (saque>0 && saque>saldo) {
			System.out.println("\nOperação - Saque" + "\nSaldo insuficiente.");
		} else {
			System.out.println("\nOperação - Saque" + "\nValor inválido.");
		}
		break;
		case 3 : System.out.println("\nInforme o valor do depósito: ");
		deposito = sc.nextFloat();
		System.out.println("\nOperação - Depósito" + "\nDepósito de valor: R$" + deposito + " realizado com sucesso" + "\nNovo Saldo: R$" + (saldo + deposito));
		}
		sc.close();
		System.out.println("\nObrigado pela preferência!\nTenha um bom dia!");
	}

}
