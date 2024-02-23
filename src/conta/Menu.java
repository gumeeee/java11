package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		float saldo, limite;
		String titular;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO GENERATION                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco Generation - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n Criar Conta");

				System.out.print("\nDigite o Número da Agência: ");
				agencia = leia.nextInt();

				System.out.print("Digite o nome do Titular da conta: ");
				leia.skip("\\R");
				titular = leia.nextLine();

				do {
					System.out.print("Digite o tipo da conta: (1-Conta Corrente ou 2-Conta Poupança) ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.print("Digite o Saldo da conta: ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1:
					System.out.print("Digite o Limite de Crédito da conta: ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					
					break;
				case 2:
					System.out.print("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					break;
				} 
				

				keyPress();
				break;
			case 2:
				System.out.println("\n Listar todas as Contas");
				contas.listar();

				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Conta por número");

				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");

				keyPress();
				break;
			case 5:
				System.out.println("\n Apagar Conta");

				keyPress();
				break;
			case 6:
				System.out.println("\n Sacar");

				keyPress();
				break;
			case 7:
				System.out.println("\n Depositar");

				keyPress();
				break;
			case 8:
				System.out.println("\n Transferir");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Guilherme Moura");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/gumeeee");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
