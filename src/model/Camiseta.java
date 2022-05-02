package model;

public class Camiseta extends Produto {

	private TamanhoCamiseta tamanho;
	private String cor;
	private String marca;
	
	public TamanhoCamiseta getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(TamanhoCamiseta tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Camiseta\n");
		buffer.append(nome);
		buffer.append("\nTamanho: ");
		buffer.append(tamanho);
		buffer.append("\nCor: ");
		buffer.append(cor);
		buffer.append("\nMarca: ");
		buffer.append(marca);
		buffer.append("\nValor: ");
		buffer.append(valor);
		buffer.append(" ");
		buffer.append(moeda);
		buffer.append("\n");
		return buffer.toString();
	}
	
}
