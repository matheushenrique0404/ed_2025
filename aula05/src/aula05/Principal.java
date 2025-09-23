package aula05;

public class Principal {
	
	public static void main(String[] args) {
		Carro automovel1 = new Carro();
		automovel1.setAno(1999);
		automovel1.setMarca("Volks");
		automovel1.setModelo("Fusca");
		automovel1.ligar();
		
		Automovel automovel2 = new Automovel();
		automovel2.setAno(2025);
		automovel2.setMarca("Fiat");
		automovel2.setModelo("Pulse");
		automovel2.ligar();
		
		
	}

}
