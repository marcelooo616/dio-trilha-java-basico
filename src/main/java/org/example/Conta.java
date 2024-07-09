package org.example;

import java.util.Random;

public class Conta{
     Integer numero;
     String agecia;
     Double saldo = 0.00;


    public void exibirInformacoes(Pessoa cliente, Conta conta) {
        System.out.println();
        System.out.println(cliente);
        System.out.println(conta);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agecia='" + agecia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
