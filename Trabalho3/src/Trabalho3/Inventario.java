package Trabalho3;

import java.util.HashMap;

public class Inventario {
	private HashMap<String, Integer> produtos = new HashMap<>();
	
	public void adicionarProduto(String chave, Integer valor) {
		this.produtos.put(chave,  valor);
	}
	
	public void removerProduto(String chave) {
		this.produtos.remove(chave);
	}
	
	public void listarProduto() {
		
	}

}
