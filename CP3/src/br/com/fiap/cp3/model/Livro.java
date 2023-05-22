package br.com.fiap.cp3.model;

public class Livro extends Produto{
	private String autor;
	private String editora;
	
	public Livro(String nome, String descricao, double preco, String autor, String editora, int estoque){
		super(nome, descricao, preco, estoque);
		this.autor = autor;
		this.editora = editora;
	}
	
	
	@Override
	public String toString() {
		return "Livro"
				+ "\nnome=" + super.getNome() 
				+ "\ndescricao=" + super.getDescricao() 
				+ "\npreco=" + super.getPreco() 
				+ "\nestoque=" + super.getEstoque()
				+ "\nautor=" + autor 
				+ "\neditora=" + editora;
	}


	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
