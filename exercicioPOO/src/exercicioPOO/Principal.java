package exercicioPOO;

public class Principal {
	
	public static void main(String[] args) {
		
		FuncionarioPJ pj = new FuncionarioPJ();
		pj.setNome("Matheus LTDA");
		pj.setCpf("02295766133");
		pj.setSalarioBase(2000.00);
		double calculoSalarioPJ = pj.calcularSalario(pj.getSalarioBase());
		

		
		FuncionarioCLT clt = new FuncionarioCLT();
		clt.setNome("Matheus CLT");
		clt.setCpf("02295766133");
		clt.setSalarioBase(1532.00);
		double calculoSalarioCLT = clt.calcularSalario(clt.getSalarioBase());
		
		
		FuncionarioComissado comissionado = new FuncionarioComissado();
		comissionado.setNome("Matheus CLT");
		comissionado.setCpf("0295766133");
		comissionado.setSalarioBase(1532.00);
		double calculoSalarioComissionado = comissionado.calcularSalario(comissionado.getSalarioBase(), 200.00);
		
		System.out.println("Salário PJ:");
		System.out.println(calculoSalarioPJ);
		System.out.println("--------------------------------");
		System.out.println("Salário CLT:");
		System.out.println(calculoSalarioCLT);
		System.out.println("--------------------------------");
		System.out.println("Salário Comissionado:");
		System.out.println(calculoSalarioComissionado);

		
	}

}
