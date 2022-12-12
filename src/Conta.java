public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;//Isto é uma composicao, ou seja, relacionamento entre classes
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.setAgencia(agencia);
		this.setNumero(numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false; 
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private void setNumero(int numero) {
		if(numero > 0) {
			this.numero = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	private void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}
	}
	
	public Cliente getTitular() {
		return this.titular; 
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}