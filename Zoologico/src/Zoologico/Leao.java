package Zoologico;

public class Leao extends Animal {
	
	double tamanhoJuba;

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "RAAAW";
	}

	public double getTamanhoJuba() {
		return tamanhoJuba;
	}

	public void setTamanhoJuba(double tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "Carne";
	}
	


}
