package loja;

import java.util.Scanner;

public class loja{
	public static void main(String[] args) {
		Fatura compra = new Fatura();
		int opcao;
		
		Scanner scan = new Scanner(System.in);
		
		Produto[] estoque = new Produto[4];
		
		estoque[0] = new Produto("Cooler para processador", 40.00);
		estoque[1] = new Produto("Mouse Gamer sem fio", 70.00);
		estoque[2] = new Produto("Teclado / mouse sem fio", 125.00);
		estoque[3] = new Produto("Monitor LED 24", 692.00);
		
		do {
			System.out.println("\nLoja de suprimentos de Informática");
			System.out.println("\nEscolha um produto\n");
			System.out.println("#Estoque:");
			
			for (int i = 0; i < estoque.length; i++)
				System.out.println("("+i+") "+estoque[i].getDescricao()+" || "+estoque[i].getValor());
			
			System.out.println("("+estoque.length+") Sair");
			opcao = scan.nextInt();
			if (opcao != estoque.length) {
				System.out.print("Quantidade: ");
				Item i = new Item(scan.nextInt(), estoque[opcao].getValor());
				compra.setItem(i);
			}
			
		}while(opcao != estoque.length); 
		
		System.out.println("\nTotal = "+compra.getFatura());
		scan.close();
	}
}