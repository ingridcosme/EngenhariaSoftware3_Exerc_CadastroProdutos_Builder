package model;

public abstract class ProdutoBuilder {

	public abstract ProdutoBuilder addCategoriaProduto(CategoriaProduto categoria);
	
	public abstract ProdutoBuilder addNomeProduto(String nome);
	
	public abstract ProdutoBuilder addValorProduto(double valor, String moeda);

	public abstract Produto get();
	
}
