
public class TesteSacaNegativo {
	public static void main(String [] args) {
		Conta conta = new Conta(1000, 2000);
		conta.deposita(100);
		conta.saca(200);
	}
}
