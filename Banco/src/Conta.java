public abstract class Conta implements Iconta {
	
	protected int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;
	
	private static final int agencia_padrao = 1;
	private static int sequencia = 1;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.agencia_padrao;
		this.numero = Conta.sequencia++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
		System.out.println(saldo);
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}


	public double getNumero() {
		return numero;
	}



	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
}