package exerciciosAula6;

import java.util.ArrayList;

public class Cars {
	
	public int RetornaElementos(ArrayList<String> lista) {
	    return lista.size(); 
	}
	
	public ArrayList<String> RetornaListas(ArrayList<String> lista1, ArrayList<String> lista2) {
		ArrayList<String> novaLista = new ArrayList<>(lista1); 
	    novaLista.addAll(lista2); 
	    return novaLista; 
	}
	
	
}
