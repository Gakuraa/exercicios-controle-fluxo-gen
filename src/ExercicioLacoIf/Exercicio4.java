package ExercicioLacoIf;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Algoritmo para advinhar seu animal!!");
		System.out.println("\nInforme a primeira característica:\n Vertebrado ou Invertebrado?");
		String caracteristica1 = sc.nextLine();
		System.out.println("\nInforme a segunda característica:\n Ave, Mamífero, Inseto e Anelídeo");
		String caracteristica2 = sc.nextLine();
		System.out.println("\nInforme a terceira característica:\n Carnívoro, Onívoro, Herbíviro e Hematófogo");
		String caracteristica3 = sc.nextLine();

		if (caracteristica1.equalsIgnoreCase("vertebrado")) {
			if (caracteristica2.equalsIgnoreCase("ave")) {
				if (caracteristica3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else if (caracteristica3.equalsIgnoreCase("onívoro")) {
					System.out.println("Pomba");
				} else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Outro tipo de ave herbívora");
				} else {
					System.out.println("Característica 3 inválida para aves vertebradas");
				}
			} else if (caracteristica2.equalsIgnoreCase("mamífero")) {
				if (caracteristica3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Característica 3 inválida para mamíferos vertebrados");
				}
			} else {
				System.out.println("Característica 2 inválida para vertebrados");
			}
		}
		
		if (caracteristica1.equalsIgnoreCase("invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("inseto")) {
				if (caracteristica3.equalsIgnoreCase("hematófogo")) {
					System.out.println("Pulga");
				} else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				} else if (caracteristica3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Outro tipo de inseto herbívoro");
				} else {
					System.out.println("Característica 3 inválida para insetos invertebrados");
				}
			} else if (caracteristica2.equalsIgnoreCase("anelídeo")) {
				if (caracteristica3.equalsIgnoreCase("hematófogo")) {
					System.out.println("Sanguessuga");
				} else if (caracteristica3.equalsIgnoreCase("onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Característica 3 inválida para anelídeos invertebrados");
				}
			} else {
				System.out.println("Característica 2 inválida para invertebrados");
			}
		}

		sc.close();
	}
}