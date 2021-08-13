package Classes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NovaDoacao {
	Doacoes cadastroNovo = new Doacoes();

	public static void cadastroDoacao() {
		ArrayList<Doacoes> doacoes1 = new ArrayList();
		Random randow = new Random();
		Scanner leia = new Scanner(System.in);
		int escolha;
		boolean sair = false;
		int quant;

		while (sair == false) {
			System.out.println("O que você deseja doar ?" + "\n1 - Brinquedos" + "\n2 - Alimento" + "\n3 - Roupa"
					+ "\n4 - Utensílios domésticos");

			int op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Sua doação será em brinquedo! Obrigado!");
				System.out.println("Qual quantidade gostaria de doar?");
				quant = leia.nextInt();
				Doacoes a = new Doacoes("Brinquedo", quant);
				doacoes1.add(a);
				sair = true;
				break;
			case 2:
				System.out.println("Sua doação será em Alimento! Obrigado!");
				System.out.println("Qual quantidade gostaria de doar?");
				quant = leia.nextInt();
				Doacoes b = new Doacoes("Alimento", quant);
				doacoes1.add(b);
				sair = true;
				break;
			case 3:
				System.out.println("Sua doação será em Roupa! Obrigado!");
				System.out.println("Qual quantidade gostaria de doar?");
				quant = leia.nextInt();
				Doacoes c = new Doacoes("Roupa", quant);
				doacoes1.add(c);
				sair = true;
				break;
			case 4:
				System.out.println("Sua doação será em Utensilios domésticos! Obrigado!");
				System.out.println("Qual quantidade gostaria de doar?");
				quant = leia.nextInt();
				Doacoes d = new Doacoes("Utensilios domésticos", quant);
				doacoes1.add(d);
				sair = true;
				break;
			default:
				System.out.println("Opção inválida...");
			}
		}

		for (Doacoes d : doacoes1) {
			System.out.println(d);
		}
		cadastroDoacao2();
	}

	public static void cadastroDoacao2() {
		int op;
		boolean sair = false;
		Scanner leia = new Scanner(System.in);
	
		while (sair == false) {
			System.out.println("Gostaria de fazer nova doação? \n1 - Sim \n2 - Não");
			op = leia.nextInt();
			
			switch (op) {
			case 1: cadastroDoacao();
			break;
			case 2:System.out.println("Obrigado!, Enviaremos um e-mail para você confirmando sua doação.");
			sair = true;
			break;
			}
			sair = true;
		}
	}
}
