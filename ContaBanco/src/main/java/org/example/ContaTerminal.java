package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao simulador de banco");
        System.out.println("Por favor digite o numero da conta!");
        numero = sc.nextInt();
        System.out.println("Por favor digite o nome da agencia");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.println("Por favor digite o nome do cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor digite o saldo da conta");
        saldo = sc.nextDouble();
        sc.close();
        System.out.println("Olá cliente "+nomeCliente+" obrigado por criar a sua conta no nosso banco,a sua agência é "+agencia+", conta "
                +numero+" e o seu saldo R$"+saldo+" já esta disponível para saque");

    }
}