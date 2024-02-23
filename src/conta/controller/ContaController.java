package conta.controller;

import java.util.ArrayList;
import java.util.List;

import conta.model.ContaBancaria;
import conta.model.ContaPoupanca;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private List<ContaBancaria> contas;
	int numero = 0;

	public ContaController() {
		this.contas = new ArrayList<>();
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listar() {
		for (ContaBancaria conta : contas) {
			conta.extrato();
		}

	}

	@Override
	public void cadastrar(ContaBancaria conta) {
		contas.add(conta);
		System.out.println("\n Conta número: " + conta.getNumero() + " Titular: " + conta.getTitular()
				+ " foi cadastrado(a) no banco com sucesso!");

	}

	@Override
	public void atualizar(ContaBancaria conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNumeroConta(numero);

		if (conta != null) {
			if (conta.sacar(valor))
				System.out.println("\n Saque na conta número: " + numero + " foi realizado com sucesso!");
		} else {
			System.out.println("\n Conta número: " + numero + " não encontrada!");
		}

	}

	@Override
	public void depositar(int numero, float valor) {

		var conta = buscarNumeroConta(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\n Depósito na Conta de número: " + numero + " realizado com sucesso!");
			
		} else {
			System.out.println("\n Conta número: " + numero + " não encontrada ou a Conta de destino não é Conta corrente!");
		}
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNumeroConta(numeroOrigem);
		var contaDestino = buscarNumeroConta(numeroDestino);
		
		if(contaOrigem != null && contaDestino != null) {
			
			if(contaOrigem.sacar(valor)) {
				contaDestino.depositar(valor);
				System.out.println("\n A transferência foi realizada com sucesso!");
			}
			
			
		} else {
			System.out.println("\n Conta de origem e ou de Destino não foram encontradas!");
		}

	}

	@Override
	public ContaBancaria buscarNumeroConta(int numero) {
		for (ContaBancaria conta : this.contas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;
	}

}
