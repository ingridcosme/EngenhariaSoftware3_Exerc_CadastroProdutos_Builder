package model;

public class Calcado extends Produto {

	private int tamanho;
	private String cor;
	private TipoCalcado tipo;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public TipoCalcado getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoCalcado tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Calcado\n");
		buffer.append(nome);
		buffer.append("\nTipo: ");
		buffer.append(tipo);
		buffer.append("\nTamanho: ");
		buffer.append(tamanho);
		buffer.append("\nCor: ");
		buffer.append(cor);
		buffer.append("\nValor: ");
		buffer.append(valor);
		buffer.append(" ");
		buffer.append(moeda);
		buffer.append("\n");
		return buffer.toString();
	}
	
}
