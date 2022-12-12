
public class TestaGetESet {
	public static void main (String [] args) {
		Conta conta = new Conta(1000, 2000);
		Cliente cliente = new Cliente();
		
		System.out.println(conta.getNumero());
		
		cliente.setNome("Murilo Dutra Alves");
		cliente.setCpf("33333333333");
		
		conta.setTitular(cliente);
		conta.getTitular().setProfissao("Programador");
		
		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(conta.getTitular());
		System.out.println(cliente);
	}
}
