import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Mateus dos Santos Araujo";
        String tipoConta = "Corrente";
        Double saldoInicial = 2500.00;
        int escolha = 0;

        System.out.println("**************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("**************");

        while (escolha != 4) {
            System.out.println("Operação");
            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada");
            escolha = leitura.nextInt();
            if (escolha == 1) {
                System.out.println("Seu saldo atual é: " + saldoInicial);
            } else if (escolha == 2) {
                System.out.println("Digite o valor que irá receber:");
                double receber = leitura.nextInt();
                saldoInicial += receber;
                System.out.println("Saldo recebido com sucesso!");
            } else if (escolha == 3) {
                System.out.println("Digite o valor que deseja transferir:");
                double transferencia = leitura.nextInt();
                    if (transferencia > saldoInicial) {
                        System.out.println("Saldo insuficiente para realizar essa transferência!");
                    } else {
                        saldoInicial -= transferencia;
                        System.out.println("Transferência realizada com sucesso!");
                    }
            } else if (escolha == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }
}
