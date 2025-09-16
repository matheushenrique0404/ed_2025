package aula6;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("Banco de Dados II");
		disciplinas.add("Estrutura de dados");
		disciplinas.add("Arquitetura de Software");
		disciplinas.add("Álgebra Matemática");

		System.out.println(disciplinas);
		System.out.println(disciplinas.get(2));

		disciplinas.set(0, "Banco de Dados I");

		System.out.println(disciplinas);
		disciplinas.remove(1);
		System.out.println(disciplinas);
		
		for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i));
		}
		
		disciplinas.contains("Banco de Dados I");

	}

}
