package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoController {

private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProdutoNaLista(Produto produto){
		produtos.add(produto);
	}
	
	public void listarProdutos() {
		for(Produto produto : produtos) {
			System.out.println("\n");
			System.out.println(produto);
		}
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
