package model;

import halper.Utils;

public class Produto {

	private static int contador = 1;

	private int codigo;
	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		super();
		this.codigo = Produto.contador;
		this.nome = nome;
		this.preco = preco;
		Produto.contador += 1;
	}

	// codigo
	public int getCodigo() {
		return codigo;
	}

	// nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	// preço
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Código: " + this.getCodigo() +
				"\nNome: " + this.getNome() +
				"\nPreço: " + Utils.doubleParaString(this.getPreco());
	}
}
