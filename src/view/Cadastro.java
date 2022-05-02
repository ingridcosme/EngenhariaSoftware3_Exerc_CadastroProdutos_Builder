package view;

import controller.ProdutoController;
import model.Calcado;
import model.CalcadoBuilder;
import model.Camiseta;
import model.CamisetaBuilder;
import model.CategoriaProduto;
import model.EquipArmazenamento;
import model.EquipArmazenamentoBuilder;
import model.JogoEletronico;
import model.JogoEletronicoBuilder;
import model.Produto;
import model.TamanhoCamiseta;
import model.TipoCalcado;
import model.TipoEquipamento;
import model.TipoVideogame;

public class Cadastro {

	public static void main(String[] args) {
		ProdutoController pCont = new ProdutoController();
		
//		================================== ADICIONANDO AS CAMISETAS ==================================
		
		Camiseta camiseta1 = (Camiseta) CamisetaBuilder.builder()
				.addTamanhoCamiseta(TamanhoCamiseta.GG)
				.addCorCamiseta("azul")
				.addMarcaCamiseta("Off")
				.addCategoriaProduto(CategoriaProduto.CAMISETA)
				.addNomeProduto("Camiseta A1")
				.addValorProduto(80.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(camiseta1);
	
		Camiseta camiseta2 = (Camiseta) CamisetaBuilder.builder()
				.addTamanhoCamiseta(TamanhoCamiseta.G)
				.addCorCamiseta("branca")
				.addMarcaCamiseta("Kit")
				.addCategoriaProduto(CategoriaProduto.CAMISETA)
				.addNomeProduto("Camiseta A2")
				.addValorProduto(150.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(camiseta2);
		
		Camiseta camiseta3 = (Camiseta) CamisetaBuilder.builder()
				.addTamanhoCamiseta(TamanhoCamiseta.GG)
				.addCorCamiseta("preta")
				.addMarcaCamiseta("Reg")
				.addCategoriaProduto(CategoriaProduto.CAMISETA)
				.addNomeProduto("Camiseta A3")
				.addValorProduto(245.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(camiseta3);
		
//		================================== ADICIONANDO OS CALCADOS ==================================
		
		try {
			Calcado calcado1 = CalcadoBuilder.builder()
					.addCorCalcado("cinza")
					.addTamanhoCalcado(40)
					.addTipoCalcado(TipoCalcado.SOCIAL)
					.addCategoriaProduto(CategoriaProduto.CALCADO)
					.addNomeProduto("Calcado C1")
					.addValorProduto(280.00, "reais")
					.get();
			
			pCont.adicionarProdutoNaLista(calcado1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Calcado calcado2 = CalcadoBuilder.builder()
					.addTamanhoCalcado(38)
					.addCorCalcado("preto")
					.addTipoCalcado(TipoCalcado.TENIS)
					.addCategoriaProduto(CategoriaProduto.CALCADO)
					.addNomeProduto("Calcado C2")
					.addValorProduto(350.00, "reais")
					.get();
			
			pCont.adicionarProdutoNaLista(calcado2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Calcado calcado3 = CalcadoBuilder.builder()
					.addTamanhoCalcado(42)
					.addCorCalcado("branco")
					.addTipoCalcado(TipoCalcado.TENIS)
					.addCategoriaProduto(CategoriaProduto.CALCADO)
					.addNomeProduto("Calcado C3")
					.addValorProduto(295.00, "reais")
					.get();
			
			pCont.adicionarProdutoNaLista(calcado3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		================================== ADICIONANDO OS JOGOS ==================================
		
		JogoEletronico jogo1 = JogoEletronicoBuilder.builder()
				.addTituloJogo("Call of Duty Black Ops Cold War")
				.addTipoVideogameJogo(TipoVideogame.PLAYSTATION)
				.addCategoriaProduto(CategoriaProduto.JOGOELETRONICO)
				.addNomeProduto("Jogo J1")
				.addValorProduto(170.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(jogo1);
		
		JogoEletronico jogo2 = JogoEletronicoBuilder.builder()
				.addTituloJogo("The Amazing Spider - Man 2")
				.addTipoVideogameJogo(TipoVideogame.XBOX)
				.addCategoriaProduto(CategoriaProduto.JOGOELETRONICO)
				.addNomeProduto("Jogo J2")
				.addValorProduto(350.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(jogo2);
		
		JogoEletronico jogo3 = JogoEletronicoBuilder.builder()
				.addTituloJogo("Zelda Breath of the Wild")
				.addTipoVideogameJogo(TipoVideogame.SWITCH)
				.addCategoriaProduto(CategoriaProduto.JOGOELETRONICO)
				.addNomeProduto("Jogo J3")
				.addValorProduto(159.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(jogo3);
		
//		================================== ADICIONANDO OS EQUIPAMENTOS PARA ARMAZENAMENTO ==================================
		
		EquipArmazenamento equipamento1 = EquipArmazenamentoBuilder.builder()
				.addTipoEqArmaz(TipoEquipamento.HDD)
				.addCapacidadeEqArmaz(1, "TB")
				.addFabricanteEqArmaz("Seagate")
				.addCategoriaProduto(CategoriaProduto.EQUIPAMENTOPARAARMAZENAMENTO)
				.addNomeProduto("Equipamento E1")
				.addValorProduto(438.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(equipamento1);
		
		EquipArmazenamento equipamento2 = EquipArmazenamentoBuilder.builder()
				.addTipoEqArmaz(TipoEquipamento.SSD)
				.addCapacidadeEqArmaz(240, "GB")
				.addFabricanteEqArmaz("Crucial")
				.addCategoriaProduto(CategoriaProduto.EQUIPAMENTOPARAARMAZENAMENTO)
				.addNomeProduto("Equipamento E2")
				.addValorProduto(360.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(equipamento2);
		
		EquipArmazenamento equipamento3 = EquipArmazenamentoBuilder.builder()
				.addTipoEqArmaz(TipoEquipamento.MS_NVME)
				.addCapacidadeEqArmaz(250, "GB")
				.addFabricanteEqArmaz("Kingston")
				.addCategoriaProduto(CategoriaProduto.EQUIPAMENTOPARAARMAZENAMENTO)
				.addNomeProduto("Equipamento E3")
				.addValorProduto(388.00, "reais")
				.get();
		
		pCont.adicionarProdutoNaLista(equipamento3);
		
//		================================== IMPRIMINDO PRODUTOS ==================================

		pCont.listarProdutos();
		
	}
}
