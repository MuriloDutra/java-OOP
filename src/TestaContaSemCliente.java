
public class TestaContaSemCliente {
	public static void main(String [] args) {
		Conta conta = new Conta(1000, 2000);
		
		System.out.println(conta.getSaldo());
		
		conta.setTitular(new Cliente());
		System.out.println(conta.getTitular());
		conta.getTitular().setNome("Murilo");
		System.out.println(conta.getTitular().getNome());
	}
}
