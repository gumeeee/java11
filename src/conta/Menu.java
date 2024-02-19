package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta(1, 123, 1, "Guilherme Moura", 50000.0f);

		conta1.extrato();
		System.out.println("\n");

		if (conta1.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + conta1.getSaldo());
		else
			System.out.println("Saldo insuficiante!!");

		conta1.depositar(1000);
		System.out.println("O saldo atual após depósito é: " + conta1.getSaldo());

		sc.close();
	}
}
