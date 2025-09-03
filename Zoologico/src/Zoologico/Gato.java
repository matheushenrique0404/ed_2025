package Zoologico;

public class Gato extends Animal {
	
	String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "MIAU";
	}

	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return "Ração de Gato";
	}
	

}
