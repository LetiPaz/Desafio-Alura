import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // dados do cliente
        String nome = "Jacqueline Oliveira";
        String tipoConta = "corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("***********************\n" +
                "Dados inicias do cliente: \n\n" +
                "Nome: " + nome + "\n" +
                "Tipo conta: " + tipoConta + "\n" +
                "Saldo inicial: " + saldo + "\n" +
                "***********************\n");
        // menu
        String menu = "Operações\n" +
                "1- Consultar saldos\n" +
                "2- Receber valor\n" +
                "3- Transferir valor\n" +
                "4- Sair\n" +
                "\n" +
                "Digite a opção desejada:";
        while (opcao != 4) {
            System.out.println(menu);
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo da Conta: " + saldo);
            } else if (opcao == 2) {
                double deposito;
                System.out.println("Quanto você quer depositar? ");
                deposito = ler.nextDouble();
                saldo = deposito + saldo;
                System.out.println("saldo: " + saldo);

            } else if (opcao == 3) {
                double transferencia;
                System.out.println("Quanto você quer transferir?");
                transferencia = ler.nextDouble();
                if (transferencia < saldo) {
                    saldo = saldo - transferencia;
                    System.out.println("saldo: " + saldo);
                }
                else {
                    System.out.println("Saldo insuficiente para realizar a transferência");
                }

            } else {
                System.out.println("Opção inválida");
            }
        }

    }
}