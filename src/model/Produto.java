package model;

public class Produto {

	private static int SEQUENCIAL = 1;
	
	protected CategoriaProduto categoria;
	protected int codigo;
	protected String nome;
	protected double valor;
	protected String moeda;

	public Produto() {
		this.codigo = SEQUENCIAL++;
	}
	
	public CategoriaProduto getCategoria() {
		return categoria;
	}
	
	public void setCategoria(CategoriaProduto categoria) {
		this.categoria = categoria;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getMoeda() {
		return moeda;
	}
	
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Produto\n");
		buffer.append(nome);
		buffer.append("\nCodigo: ");
		buffer.append(codigo);
		buffer.append("\nCategoria: ");
		buffer.append(categoria);
		buffer.append("\nValor: ");
		buffer.append(valor);
		buffer.append(" ");
		buffer.append(moeda);
		buffer.append("\n");
		return buffer.toString();
	}
	
}
