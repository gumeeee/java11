package conta.model;

public class ContaPoupanca extends ContaBancaria{
	private int aniversario;
	
	

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void extrato() {
		super.extrato();
		
		System.out.println("Aniversário: " + this.aniversario);
	}
	
	
}
