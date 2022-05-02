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
	public CalcadoBuilder addCategoriaProduto(CategoriaProduto categoria) {
		this.calcado.setCategoria(categoria);
		return this;
	}

	@Override
	public CalcadoBuilder addNomeProduto(String nome) {
		this.calcado.setNome(nome);
		return this;
	}

	@Override
	public CalcadoBuilder addValorProduto(double valor, String moeda) {
		this.calcado.setValor(valor);
		this.calcado.setMoeda(moeda);
		return this;
	}

	public CalcadoBuilder addTamanhoCalcado(int tamanho) throws Exception {
		if(tamanho >= 35 && tamanho <= 44) {
			this.calcado.setTamanho(tamanho);
		} else {
			throw new Exception("Tamanho não aceito");
		}
		return this;
	}
	
	public CalcadoBuilder addCorCalcado(String cor) {
		this.calcado.setCor(cor);
		return this;
	}
	
	public CalcadoBuilder addTipoCalcado(TipoCalcado tipo) {
		this.calcado.setTipo(tipo);
		return this;
	}
		
	@Override
	public Calcado get() {
		return this.calcado;
	}

}
