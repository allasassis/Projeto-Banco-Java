public class Conta {
	private double saldo; 	
	private int agencia;
	private int numero;
	private Cliente titular;  		
	private static int total;
	
	
	
	public Conta(int agencia, int numero) {					
		Conta.total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta");	
	}
	
	
	
	void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("O valor de R$" + valor + " foi depositado com sucesso!");
		} else {
			System.out.println("Não é possível criar depositar um valor menor que 0, por favor, tente novamente");
		}
		
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("O saque foi realizado com sucesso e o valor de " + valor + " foram sacados da sua conta");
			return true;
		} else {
			System.out.println("Você não tem dinheiro para fazer tal operação, nada foi retirado de sua conta");
			return false;
		}
			
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("A transferência foi realizada com sucesso!");
			System.out.println("O valor na sua conta AGORA é de R$" + this.saldo);
			return true;
		} else {
			System.out.println("A transferência NÃO foi realizada porque você não tinha dinheiro suficiente na sua conta");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumber() {
		return this.numero;
	}
	

	
	public void setNumber(int numero) {  			
		if (numero <= 0) {
			System.out.println("ERRO: Você não pode usar números menores ou iguais a 0!");
		} else {
		this.numero = numero;
		System.out.println("O número da sua CONTA foi alterado!");
			}
		}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia >= 0) {
			this.agencia = agencia;
			System.out.println("O número da sua AGENCIA foi alterado!");
			return;
		} else {
			System.out.println("ERRO: Você não pode usar números menores ou iguais a 0!");
		}
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
