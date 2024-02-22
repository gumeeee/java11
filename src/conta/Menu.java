package conta;

import conta.model.ContaCorrente;

public class Menu {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(32, 33, 1, "Guilherme Moura da Silva", 4000.0f, 3000.0f);
		
		System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
		contaCorrente.sacar(2000);
		System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
		
		contaCorrente.extrato();
		
	}
}
