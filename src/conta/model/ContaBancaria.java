package conta.model;

public abstract class ContaBancaria {
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public ContaBancaria() {

	}

	public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\nSaldo insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public void extrato() {

		String tipoConta = "";

		switch (this.tipo) {
		case 1:
			tipoConta = "Conta Corrente";
			break;
		case 2:
			tipoConta = "Conta Poupança";
			break;
		default:
			tipoConta = "Tipo de Conta invalida";
		}

		System.out.println("************************************");

		System.out.println("Dados da conta");

		System.out.println("************************************");

		System.out.println("Número da conta: " + this.numero);
		System.out.println("Agência da conta: " + this.agencia);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Titular da conta: " + this.titular);
		System.out.println("Saldo da conta: " + this.saldo);
	}

}
