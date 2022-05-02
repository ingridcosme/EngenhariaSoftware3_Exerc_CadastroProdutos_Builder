package model;

public class JogoEletronicoBuilder extends ProdutoBuilder {
	
	private JogoEletronico jogo;
	
	public JogoEletronicoBuilder() {
		this.jogo = new JogoEletronico();
	}
	
	public static JogoEletronicoBuilder builder() {
		return new JogoEletronicoBuilder();
	}

	@Override
	public JogoEletronicoBuilder addCategoriaProduto(CategoriaProduto categoria) {
		this.jogo.setCategoria(categoria);
		return this;
	}

	@Override
	public JogoEletronicoBuilder addNomeProduto(String nome) {
		this.jogo.setNome(nome);
		return this;
	}

	@Override
	public JogoEletronicoBuilder addValorProduto(double valor, String moeda) {
		this.jogo.setValor(valor);
		this.jogo.setMoeda(moeda);
		return this;
	}

	public JogoEletronicoBuilder addTituloJogo(String titulo) {
		this.jogo.setTitulo(titulo);
		return this;
	}
	
	public JogoEletronicoBuilder addTipoVideogameJogo(TipoVideogame videogame) {
		this.jogo.setVideogame(videogame);
		return this;
	}
	
	@Override
	public JogoEletronico get() {
		return this.jogo;
	}

}
