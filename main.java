public class Main {

	public static void main(String[] args) {
		Conta contaDoAllas = new Conta(1332, 329402);
		
		// O problema aqui é o valor default da agência e número, que são 0 para ambos, oque vai contra a 'regra de negócios da empresa'
		
		System.out.println(contaDoAllas.getNumber());
		System.out.println(contaDoAllas.getAgencia());
		
		Cliente allas = new Cliente();
		
		contaDoAllas.setTitular(allas);
		
		allas.setNome("Allas");
		allas.setCpf("352.142.568-17");
		allas.setProfissao("Mini Pekka");
		
		System.out.println(contaDoAllas.getTitular().getCpf());
		
		contaDoAllas.getTitular().setProfissao("Programador");             // << Você pode alternar entre get e set
		
		System.out.println(contaDoAllas.getTitular().getProfissao());
		
		contaDoAllas.deposita(0.1);
		
		System.out.println(contaDoAllas.getSaldo());
		
		Conta contaDoPaulo = new Conta(1332, 37283);
		
		System.out.println(Conta.getTotal());
	}

}