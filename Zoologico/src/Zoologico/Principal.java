package Zoologico;

public class Principal {
	
	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Andrézão");
		cachorro.setIdade(24);
		cachorro.setPeso(100.0);
		cachorro.setRaca("Pitbull");
		String latidoCachorro = cachorro.emitirSom() ;
		String alimentoCachorro = cachorro.alimentar();

		
		Gato gato = new Gato();
		gato.setNome("Garfield");
		gato.setIdade(7);
		gato.setPeso(70.0);
		gato.setCor("Laranja");
		String miadoGato = gato.emitirSom();
		String alimentoGato = gato.alimentar();

		
		Leao leao = new Leao();
		leao.setNome("Simba");
		leao.setIdade(15);
		leao.setPeso(150.0);
		leao.setTamanhoJuba(30);
		String rugidoLeao = leao.emitirSom();
		String alimentoLeao = leao.alimentar();

		
		System.out.println("Cachorro:");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.getPeso());
		System.out.println(cachorro.getRaca());
		System.out.println(latidoCachorro);
		System.out.println(alimentoCachorro);
		System.out.println("--------------------------------");
		System.out.println("Gato:");
		System.out.println(gato.getNome());
		System.out.println(gato.getIdade());
		System.out.println(gato.getPeso());
		System.out.println(gato.getCor());
		System.out.println(miadoGato);
		System.out.println(alimentoGato);
		System.out.println("--------------------------------");
		System.out.println("Leão:");
		System.out.println(leao.getNome());
		System.out.println(leao.getIdade());
		System.out.println(leao.getPeso());
		System.out.println(leao.getTamanhoJuba());
		System.out.println(rugidoLeao);
		System.out.println(alimentoLeao);
	}

}
