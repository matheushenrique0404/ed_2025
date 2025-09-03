package Zoologico;

public class Cachorro extends Animal {
	
	String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Latido";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "Ração";
	}
	
	
	
	
		
}
