package model;

public class CalcadoBuilder extends ProdutoBuilder {
	
	private Calcado calcado;
	
	public CalcadoBuilder() {
		this.calcado = new Calcado();
	}
	
	public static CalcadoBuilder builder() {
		return new CalcadoBuilder();
	}

	@Override
	public ProdutoBuilder addCategoriaProduto(CategoriaProduto categoria) {
		this.calcado.setCategoria(categoria);
		return this;
	}

	@Override
	public ProdutoBuilder addNomeProduto(String nome) {
		this.calcado.setNome(nome);
		return this;
	}

	@Override
	public ProdutoBuilder addValorProduto(double valor, String moeda) {
		this.calcado.setValor(valor);
		this.calcado.setMoeda(moeda);
		return this;
	}

	public ProdutoBuilder addTamanhoCalcado(int tamanho) throws Exception {
		if(tamanho >= 35 && tamanho <= 44) {
			this.calcado.setTamanho(tamanho);
		} else {
			throw new Exception("Tamanho não aceito");
		}
		return this;
	}
	
	public ProdutoBuilder addCorCalcado(String cor) {
		this.calcado.setCor(cor);
		return this;
	}
	
	public ProdutoBuilder addTipoCalcado(TipoCalcado tipo) {
		this.calcado.setTipo(tipo);
		return this;
	}
		
	@Override
	public Produto get() {
		return this.calcado;
	}

}
