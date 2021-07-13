package loja;

public class Item {
	private double fatura;
	private int quantidade;
	
	public Item(int quantidade, double valor) {
		this.quantidade = quantidade;
		fatura = this.quantidade * valor;
	}
	
	public double getFatura() {
		return fatura;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
}
