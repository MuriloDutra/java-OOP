
public class TesteDeReferencia {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta(1000, 2000);
		Conta segundaConta = primeiraConta;
				
		primeiraConta.deposita(300);
		
		System.out.println("Primeira: " + primeiraConta.getSaldo());
		System.out.println("Segunda: " + segundaConta.getSaldo());
		
		segundaConta.deposita(100);
		
		System.out.println("Primeira: " + primeiraConta.getSaldo());
		System.out.println("Segunda: " + segundaConta.getSaldo());
		
		if(primeiraConta == segundaConta) { 
			System.out.println("Mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
