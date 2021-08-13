package Classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NovoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoadorFisico doadorPf = new DoadorFisico();
		DoadorJuridico doadorPj = new DoadorJuridico();
		Cadastro novoCadastro = new Cadastro();
		NovaDoacao novoCadastroDoacao = new NovaDoacao();
		// doacoes novaDoacao = new doacoes();
		Scanner ler = new Scanner(System.in);
		int doar;
		int esc;
		boolean sair = false;
		
		System.out.println("\n\t\t\tSistema de Doa��es do Natal Solid�rio");
		
		while(sair == false) {
			System.out.println("\nDeseja fazer uma contribui��o?\n"
					+ "1 - Sim.\n"
					+ "2 - N�o.");
			
			System.out.print("Digite uma das op��es: "); 
			try {
				esc = ler.nextInt();
				switch(esc) {
				case 1:
					novoCadastro.cadastro();
					novoCadastroDoacao.cadastroDoacao();
					sair = true;
					break;
				case 2:
					System.out.println("Programa encerrado. Obrigado pela sua aten��o.");
					sair = true;
					break;
				default:
					System.out.println("Op��o invalida.\n");
			}
				break;
			}catch (InputMismatchException e){
				System.out.println("Exception - Por favor digite um numero");
				sair = true;
			}
		}
		
	}
}
