package trabalho;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Principal2 {
	
	static ArrayList<Integer> lista = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		String opcao = "";
		while (!opcao.equals("7")) {
			 opcao = JOptionPane.showInputDialog(
					"1 - Preencher Lista \n " +
					"2 - Ordenar a Lista (Alg 1)"+
					"3 - Ordenas a Lista (Alg 2) \n" +
					"4 - Apresentar a lista ordenada \n" +
					"5 - Apresentar a lista original \n" +
					"6 - Apresentar os tempos \n" +
					"7 - Sair \n"
					);
			
			if(opcao.equals("1")) {
				Principal2.preencherLista(lista);
			} else if (opcao.equals("2")) {
				Principal2.ordenarListaMolinaAlg(lista);
			}else if (opcao.equals("4")) {
				Principal2.apresentarListaOrdenada(lista);
			}
		}
	}
	public static void apresentarListaOrdenada(ArrayList<Integer> lista) {
		System.out.println(lista);
	}
	
	public static void preencherLista(ArrayList<Integer> lista) {
		lista.add(4);
		lista.add(1);
		lista.add(2);
	}
	
	public static void ordenarListaMolinaAlg(ArrayList<Integer> lista) {
		Collections.sort(lista);
	}

}

