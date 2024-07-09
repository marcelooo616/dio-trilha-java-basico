package org.example;

import java.util.Scanner;

public class BancoTerminal {

    private Scanner scanner;
    Conta conta = new Conta();
    Pessoa pessoa = new Pessoa();
    Double value = 0.0;
    public BancoTerminal() {
        scanner = new Scanner(System.in);
    }


    public void exibirMenuPrincipal() {
        while (true) {
            System.out.println("====================================");
            System.out.println("         Bem-vindo ao Banco         ");
            System.out.println("====================================");
            System.out.println("1. Criar Nova Conta");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Levantar Dinheiro");
            System.out.println("5. Exibir informações da conta");
            System.out.println("6. Sair");
            System.out.print("Selecione uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    criarNovaConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    depositarDinheiro();
                    break;
                case 4:
                    levantarDinheiro();
                    break;
                case 5:
                    exibirInformacoesDaConta();
                    break;
                case 6:
                    System.out.println("Obrigado por usar o Banco. Adeus!");

                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void criarNovaConta() {
        System.out.println("Por gavor, digite seu nome completo! ");
        String nome = scanner.next();
        scanner.nextLine();
        System.out.println("Por gavor, digite seu CPF! ");
        String cpf = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da conta! ");
        Integer numeroDaConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scanner.next();
        scanner.nextLine();


        pessoa.nome = nome;
        pessoa.cpf = cpf;
        conta.numero  = numeroDaConta;
        conta.agecia = agencia;
        conta.exibirInformacoes(pessoa, conta);

        System.out.println("Olá " + pessoa.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agecia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

    }

    private void exibirInformacoesDaConta() {
        System.out.println(pessoa);
        System.out.println(conta);
    }


    private void consultarSaldo() {
        System.out.println("Saldo = " + conta.saldo);
    }

    private void depositarDinheiro() {
        System.out.println("Digite o valor para deposito!");
        value = scanner.nextDouble();
        conta.saldo += value;
    }

    private void levantarDinheiro() {
        System.out.println("Digite o valor para Sacar!");
        value = scanner.nextDouble();
        conta.saldo -= value;
    }
}


