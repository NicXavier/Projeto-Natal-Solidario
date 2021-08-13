package Classes;

import java.util.List;

public class Doacoes {
	private String doacaoEscolhida;
	private int quantidade;
	
	public Doacoes() {
		
	}
	
	public Doacoes(String doacaoEscolhida, int quantidade) {
		this.doacaoEscolhida = doacaoEscolhida;
		this.quantidade = quantidade;
	}

	public String getDoacaoEscolhida() {
		return doacaoEscolhida;
	}

	public void setDoacaoEscolhida(String doacaoEscolhida) {
		this.doacaoEscolhida = doacaoEscolhida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString() {
		return "Vai doar: "+ this.doacaoEscolhida + ", quantidade a ser doada: "+ this.quantidade;
	}
}
