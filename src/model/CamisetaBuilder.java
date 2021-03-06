package model;

public class CamisetaBuilder extends ProdutoBuilder {

	private Camiseta camiseta;
	
	public CamisetaBuilder() {
		this.camiseta = new Camiseta();
	}
	
	public static CamisetaBuilder builder() {
        return new CamisetaBuilder();
    }
	
	@Override
	public CamisetaBuilder addCategoriaProduto(CategoriaProduto categoria) {
		this.camiseta.setCategoria(categoria);
		return this;
	}
	
	@Override
	public CamisetaBuilder addNomeProduto(String nome) {
		this.camiseta.setNome(nome);
		return this;
	}
	
	@Override
	public CamisetaBuilder addValorProduto(double valor, String moeda) {
		this.camiseta.setValor(valor);
		this.camiseta.setMoeda(moeda);
		return this;
	}
	
	public CamisetaBuilder addTamanhoCamiseta(TamanhoCamiseta tamanho) {
		this.camiseta.setTamanho(tamanho);
		return this;
	}
	
	public CamisetaBuilder addCorCamiseta(String cor) {
		this.camiseta.setCor(cor);
		return this;
	}
	
	public CamisetaBuilder addMarcaCamiseta(String marca) {
		this.camiseta.setMarca(marca);
		return this;
	}

	@Override
	public Camiseta get() {
		return this.camiseta;
	}
	
}
