

import java.util.Scanner;

/**
 * <h1>Projeto ContaBanco</h1>
 * 
 * Projeto proposto pela DIO para aprofundamento na sintaxe Java
 * @author Igo Marcelino
 * @version 1.0
 * @since 01/09/2023
 */

public class ContaTerminal {
    
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Apresentação do Banco
        System.out.println("------------------------");
        System.out.println("Bem vindo ao Banco DIO"+'\n');
        //Solicita que o usuário informe sua agência
        System.out.print("Informe o número da sua agência:");
        String agencia = scanner.next();
        //Solicita que o usuário informe seu número de registro
        System.out.print("Informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        //Solicita o nome do usuário
        System.out.print("Informe o seu nome: ");
        String nomeCliente = scanner.next();
        //Solicita que o usuário informe o saldo inicial
        System.out.print("Informe o saldo inicial: ");
        double saldo = scanner.nextDouble();
        //Imprime a mensagem de boas vindas bem como as informações gravadas pelo usuário 
        System.out.printf("Olá %s obrigado por abrir uma conta em nosso banco.%n" , nomeCliente);
        System.out.printf("Os dados da sua conta são :\n agência: %s\n conta: %s \n saldo R$:%s \n saldo disponível para saque R$:%s.",agencia, numeroConta, saldo, saldo);
    }
}
