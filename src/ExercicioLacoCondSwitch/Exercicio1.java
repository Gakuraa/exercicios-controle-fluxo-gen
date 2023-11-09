package ExercicioLacoCondSwitch;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto, quantidade;
		
		System.out.println("\nCódigo do produto 1 - Cachorro Quente - Preço unitário:: R$ 10,00");
		System.out.println("\nCódigo do produto 2 - X-Salada - Preço unitário:: R$ 15,00");
		System.out.println("\nCódigo do produto 3 - X-Bacon - Preço unitário:: R$ 18,00");
		System.out.println("\nCódigo do produto 4 - Bauru - Preço unitário:: R$ 12,00");
		System.out.println("\nCódigo do produto 5 - Refrigerante - Preço unitário:: R$ 8,00");
		System.out.println("\nCódigo do produto 6 - Suco de laranja - Preço unitário:: R$ 13,00");
		
		System.out.println("\nDigite o código do produto que você deseja: ");
		codigoProduto = sc.nextInt();
		
		System.out.println("Digite a quantidade que quer comprar: ");
		quantidade = sc.nextInt();
		
		switch (codigoProduto) {
		case 1: 
			System.out.println("Produto: Cachorro Quente\n" + "Quantidade: " + quantidade + " Unidades"  + "\nValor total: " + "R$" +(10*quantidade));
			break;
		case 2: 
			System.out.println("Produto: X-Salada\n" + "Quantidade: " + quantidade + " Unidades"  + "\nValor total: " + "R$" +(15*quantidade));
			break;
		case 3: 
			System.out.println("Produto: X-Bacon\n" + "Quantidade: " + quantidade + " Unidades"  + "\nValor total: " + "R$" +(18*quantidade));
			break;
		case 4: 
			System.out.println("Produto: Bauru\n" + "Quantidade: " + quantidade + " Unidades"  + "\nValor total: " + "R$" +(12*quantidade));
			break;
		case 5: 
			System.out.println("Produto: Refrigerante\n" + "Quantidade: " + quantidade + " Unidades"  + "\nValor total: " + "R$" +(8*quantidade));
			break;
		case 6: 
			System.out.println("Produto: Suco de laranja\n" + "Quantidade: " + quantidade + " Unidades" +"\nValor total: " + "R$" +(13*quantidade));
			break;
		default:
			System.out.println("Produto de código inválido");
		}
		sc.close();
	}
}
