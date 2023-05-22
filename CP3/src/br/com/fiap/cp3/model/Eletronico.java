package br.com.fiap.cp3.model;

public class Eletronico extends Produto{
	private String categoria;
	private String fabricante;
	private int capacidadeArmazenamento;
	
	public Eletronico(String nome, String descricao, double preco, int estoque, String categoria, String fabricante,
			int capacidadeArmazenamento) {
		super(nome, descricao, preco, estoque);
		this.categoria = categoria;
		this.fabricante = fabricante;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
	
	@Override
	public String toString() {
		return "Eletronico "
				+ "\nnome=" + super.getNome()
				+ "\ndescricao=" + super.getDescricao()
				+ "\npreco=" + super.getPreco()
				+ "\nestoque=" + super.getEstoque()
				+ "\ncategoria=" + categoria 
				+ "\nfabricante=" + fabricante 
				+ "\ncapacidadeArmazenamento=" + capacidadeArmazenamento;
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
}
