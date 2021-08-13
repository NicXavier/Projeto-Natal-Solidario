package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DoadorJuridico extends Pessoas{
	// Atributos
		private String razaoSocial;
		private String cnpj;

		public DoadorJuridico() {
			super();
		}

		public DoadorJuridico(int id, String nome, String telefone, String email, String endereco, String cnpj) {
			super(id, nome, telefone, email, endereco);
			this.cnpj = cnpj;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

}
