package Classes;
	
import java.util.Random;
import java.util.Scanner;

public class DoadorFisico extends Pessoas {
	// Atributos
		private String cpf;

		public DoadorFisico() {
			super();
		}

		public DoadorFisico(int id, String nome, String telefone, String email, String endereco, String cpf) {
			super(id, nome, telefone, email, endereco);
			this.cpf = cpf;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
}
