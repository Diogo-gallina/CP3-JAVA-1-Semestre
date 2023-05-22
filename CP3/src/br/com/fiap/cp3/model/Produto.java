package br.com.fiap.cp3.model;

public class Produto {
	private String nome;
	private String descricao;
	private double preco;
	private int estoque;
	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void descontoProduto() {
		if(estoque > 10) {
			preco *= 0.05;
		}else if(estoque > 50) {
			preco *= 0.1;
		}
	}
	
	public void descontoProduto(int porcentagem) {
		preco *= (porcentagem/100 + 1);
	}
	
	public void descontoProduto(String cupom) {
		if(cupom.equalsIgnoreCase("BEMVINDO")) {
			preco *= 0.4;
		}else if(cupom.equalsIgnoreCase("NERD")) {
			preco *= 0.2;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
