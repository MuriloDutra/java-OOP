

public class TestaMetodo {
	public static void main(String [] args) {
		Conta conta = new Conta(1000, 2000);
		Conta outraConta = new Conta(1001, 2001);
		
		conta.deposita(50);
		System.out.println("Saldo de conta: "+ conta.getSaldo());
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println("Retirada deu certo? "+conseguiuRetirar);
		System.out.println("Saldo de conta: "+ conta.getSaldo());
		
		outraConta.deposita(1000);
		outraConta.transfere(300, conta);
		
		System.out.println("Saldo de conta: "+ conta.getSaldo());
		System.out.println("Saldo de outraConta: "+ outraConta.getSaldo());
	}
}
