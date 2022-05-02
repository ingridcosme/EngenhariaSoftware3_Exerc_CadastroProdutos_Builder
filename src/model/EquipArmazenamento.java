package model;

public class EquipArmazenamento  extends Produto {

	private TipoEquipamento tipo;
	private int capacidade;
	private String grandezaCapacidade;
	private String fabricante;
	
	public TipoEquipamento getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoEquipamento tipo) {
		this.tipo = tipo;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public String getGrandezaCapacidade() {
		return grandezaCapacidade;
	}
	
	public void setGrandezaCapacidade(String grandezaCapacidade) {
		this.grandezaCapacidade = grandezaCapacidade;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Equipamento para Armazenamento\n");
		buffer.append(nome);
		buffer.append("\nTipo: ");
		buffer.append(tipo);
		buffer.append("\nCapacidade: ");
		buffer.append(capacidade);
		buffer.append(" ");
		buffer.append(grandezaCapacidade);
		buffer.append("\nFabricante: ");
		buffer.append(fabricante);
		buffer.append("\nValor: ");
		buffer.append(valor);
		buffer.append(" ");
		buffer.append(moeda);
		buffer.append("\n");
		return buffer.toString();
	}
	
}
