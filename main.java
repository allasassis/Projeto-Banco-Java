public class Main {

	public static void main(String[] args) {
		Conta contaDoAllas = new Conta(1332, 329402);
		
		
		System.out.println(contaDoAllas.getNumber());
		System.out.println(contaDoAllas.getAgencia());
		
		Cliente allas = new Cliente();
		
		contaDoAllas.setTitular(allas);
		
		allas.setNome("Allas");
		allas.setCpf("123.423.423-42");
		allas.setProfissao("Desenvolvedor");
		
		System.out.println(contaDoAllas.getTitular().getCpf());
		
		contaDoAllas.getTitular().setProfissao("Programador");
		
		System.out.println(contaDoAllas.getTitular().getProfissao());
		
		contaDoAllas.deposita(0.1);
		
		System.out.println(contaDoAllas.getSaldo());
		
		Conta contaDoPaulo = new Conta(1332, 37283);
		
		System.out.println(Conta.getTotal());
	}

}
