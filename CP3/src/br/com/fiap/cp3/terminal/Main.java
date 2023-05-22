package br.com.fiap.cp3.terminal;
import br.com.fiap.cp3.model.*;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro("Peter Pan", "Infantil", 200, 12, "Andre carvalho", "Notridame");
		System.out.println("Livro: ");
		System.out.println("Preco normal: " + livro.getPreco());
		
		livro.descontoProduto();
		System.out.println("Desconto Estoque: " + livro.getPreco());
		
		livro.descontoProduto(10);
		System.out.println("Desconto porcentagem: " + livro.getPreco());
		
		livro.descontoProduto("BEMVINDO");
		System.out.println("Desconto Bonus: " + livro.getPreco());
		
		System.out.println("\n" + livro.toString());
		
		Eletronico eletronico = new Eletronico("Iphone 11", "Novo", 2000, 51, "Celular", "Apple", 256);
		System.out.println("\nEletronico: ");
		System.out.println("Preco normal: " + eletronico.getPreco());
		
		eletronico.descontoProduto();
		System.out.println("Desconto Estoque: " + eletronico.getPreco());
		
		eletronico.descontoProduto(10);
		System.out.println("Desconto porcentagem: " + eletronico.getPreco());
		
		eletronico.descontoProduto("BEMVINDO");
		System.out.println("Desconto Bonus: " + eletronico.getPreco());
		
		System.out.println("\n" + eletronico.toString());
	}
}
