
public class CriaConta {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta(1000, 2000);
		Conta segundaConta = new Conta(1001, 2001);
		
		primeiraConta.deposita(200);
		primeiraConta.deposita(100);
		segundaConta.deposita(50);
		
		System.out.println("Primeiro saldo: " + primeiraConta.getSaldo());
		System.out.println("Segundo saldo: " + segundaConta.getSaldo());
	}
}
