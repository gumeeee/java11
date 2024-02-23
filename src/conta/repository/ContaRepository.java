package conta.repository;

import conta.model.ContaBancaria;

public interface ContaRepository {

	// CRUD (Create, Read, Update, Delete)
	public void procurarPorNumero(int numero);

	public void listar();

	public void cadastrar(ContaBancaria conta);

	public void atualizar(ContaBancaria conta);

	public void deletar(int numero);

	// Métodos bancarios

	public void sacar(int numero, float valor);

	public void depositar(int numero, float valor);

	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}
