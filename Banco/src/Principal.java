public class Principal {
    public static void main(String[] args) throws Exception {
        
        Cliente danilo = new Cliente();
		danilo.setNome("Danilo");
		
		Conta cc = new ContaCorrente(danilo);
		Conta cp = new ContaPoupanca(danilo);
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
        
    }
}
