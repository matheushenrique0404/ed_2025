package aula05;

public class Automovel {

	private String modelo;
	private String marca;
	private int ano;

	public void ligar() {
		System.out.println("Autom�vel ligado!");
	}

	public void ligar(boolean puxouAfogador) {
		if (puxouAfogador) {
			System.out.println("Automovel ligado");

		} else {
			System.out.println("Automovel afogado");
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
