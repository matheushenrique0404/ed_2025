package Trabalho2;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		String tarefa1 ="Limpar banheiro";
		String tarefa2 = "Lavar louça";
		String tarefa3 = "Passar pano";
		String tarefa4 = "Lavar camisa do Gigantesco";
		String tarefa5 = "Abrir cerveja";
		String tarefa6 = "Comer pestiscos";
		String tarefa7 = "Xingar o Juíz";
		
		Gerenciador g1 = new Gerenciador();
		g1.adicionarTarefa(tarefa1);
		g1.adicionarTarefa(tarefa2);
		g1.adicionarTarefa(tarefa3);
		g1.adicionarTarefa(tarefa4);
		g1.adicionarTarefa(tarefa5);
		g1.adicionarTarefa(tarefa6);
		g1.adicionarTarefa(tarefa7);
		
		System.out.println();
		g1.listarTarefas();
		
		g1.removerTarefa(tarefa1);
		System.out.println();
		
		System.out.println();
		g1.listarTarefas();
				
		ArrayList<String> tarefas = new ArrayList<String>();
		System.out.println(tarefas);
		tarefas.add(tarefa4);
		tarefas.add(tarefa5);
		tarefas.add(tarefa6);
		tarefas.add(tarefa7);
		System.out.println("Pra ser feliz no jogo do vasco é só: " 
		+ tarefas);
		
		
		
	}
	
}
