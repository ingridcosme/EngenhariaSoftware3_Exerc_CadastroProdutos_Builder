package model;

public class EquipArmazenamentoBuilder extends ProdutoBuilder {
	
	private EquipArmazenamento equipamento;
	
	public EquipArmazenamentoBuilder() {
		this.equipamento = new EquipArmazenamento();
	}
	
	public static EquipArmazenamentoBuilder builder() {
		return new EquipArmazenamentoBuilder();
	}

	@Override
	public EquipArmazenamentoBuilder addCategoriaProduto(CategoriaProduto categoria) {
		this.equipamento.setCategoria(categoria);
		return this;
	}

	@Override
	public EquipArmazenamentoBuilder addNomeProduto(String nome) {
		this.equipamento.setNome(nome);
		return this;
	}

	@Override
	public EquipArmazenamentoBuilder addValorProduto(double valor, String moeda) {
		this.equipamento.setValor(valor);
		this.equipamento.setMoeda(moeda);
		return this;
	}

	public EquipArmazenamentoBuilder addTipoEqArmaz(TipoEquipamento tipo) {
		this.equipamento.setTipo(tipo);
		return this;
	}
	
	public EquipArmazenamentoBuilder addCapacidadeEqArmaz(int capacidade, String grandezaCapacidade) {
		this.equipamento.setCapacidade(capacidade);
		this.equipamento.setGrandezaCapacidade(grandezaCapacidade);
		return this;
	}
	
	public EquipArmazenamentoBuilder addFabricanteEqArmaz(String fabricante) {
		this.equipamento.setFabricante(fabricante);
		return this;
	}
	
	@Override
	public EquipArmazenamento get() {
		return this.equipamento;
	}

}
