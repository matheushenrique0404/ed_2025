package exerciciosAula6;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Golf");
		cars.add("Palio");
		cars.add("BMW M5");
		cars.add("Marea");
		
		
		System.out.print("Tamanho do array: " + cars.size());
		System.out.println("\n");
		System.out.println(cars.contains("Golf"));
		
		Cars teste = new Cars();
		
		System.out.println(teste.RetornaElementos(cars));
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(10);
		lista.add(15);
		lista.add(10);
		lista.add(21);
		lista.add(22);
		lista.add(15);
		
		System.out.println(lista);
		
		
		
		
	}
	

	

}
