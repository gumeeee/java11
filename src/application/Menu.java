package application;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Conta contaBancaria = new Conta();
		
		contaBancaria.setNumero(352);
		contaBancaria.setAgencia(8);
		contaBancaria.setSaldo(35222);
		contaBancaria.setTipo("Corrente");
		contaBancaria.setTitular("Guilherme");
		
		System.out.println("Numero da conta: " + contaBancaria.getNumero());
		
		System.out.println("Agencia da conta: " + contaBancaria.getAgencia());
		
		System.out.println("Salda da conta: " + contaBancaria.getSaldo());
		
		System.out.println("Tipo da conta: " + contaBancaria.getTipo());
		
		System.out.println("Titular da conta: " + contaBancaria.getTitular());
	}
}
