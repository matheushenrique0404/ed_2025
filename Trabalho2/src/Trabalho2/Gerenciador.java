package Trabalho2;

import java.util.ArrayList;

public class Gerenciador {
	private ArrayList<String> tarefas = new ArrayList<String>();
	private int quantidade = 0;
	
	public void adicionarTarefa (String tarefa) {
		tarefas.add(tarefa);
	}	
	public void removerTarefa(String tarefa) {
		tarefas.remove(tarefa);
	} 
	public void listarTarefas() {
		
		if (quantidade == 0) {
			System.out.println("Nenhuma tarefa cadastrada");
		} else {
			System.out.println("Tarefas pendentes");
			for (int i = 0; i < quantidade; i++) {
				System.out.println("-" + tarefas[i]);
			}
			
		}
		
	}

}


