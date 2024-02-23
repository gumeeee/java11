package conta.controller;

import java.util.ArrayList;
import java.util.List;

import conta.model.ContaBancaria;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

}
