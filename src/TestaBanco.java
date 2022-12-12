
public class TestaBanco {
	public static void main(String [] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Murilo Dutra Alves");
		cliente.setCpf("33333333333");
		cliente.setProfissao("Programador");
		
		Conta conta = new Conta(1000, 2000);
		conta.deposita(100);
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular());
		System.out.println(cliente);
	}
}