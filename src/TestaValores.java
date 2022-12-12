
public class TestaValores {
	public static void main(String [] args) {
		Conta conta =  new Conta(1000, 2000);
		Conta outraConta = new Conta(1000, 2001);
		System.out.println("O total de contas é: " + Conta.getTotal());
	}
}
