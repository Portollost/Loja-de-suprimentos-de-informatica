package loja;

public class Fatura {
	Item[] itens;
	Double fatura;
	
	public Fatura() {
		itens = new Item[0];
		fatura = 0.0;
	}
	
	public void setItem(Item t) {
		Item[] aux = itens;
		itens = new Item[itens.length+1];
		for (int i = 0; i < aux.length; i++)
			itens[i] = aux[i];
		itens[itens.length-1] = t;
	}
	public double getFatura() {
		for (int i = 0; i < itens.length; i++)
			fatura += itens[i].getFatura();
		return fatura;
	}
	
	public Item[] getItens() {
		return itens;
	}
}
