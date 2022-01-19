package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String resposta;
        System.out.println("Olá esta é sua calculadora de calculos básicos");

        do {


            System.out.println("Digite qual operação matemática você quer fazer:");
            System.out.println("(1)Soma  (2)Subtração  (3)Divisão  (4)Multiplicação");
            Scanner leitor = new Scanner(System.in);
            Integer opcao = Integer.parseInt(leitor.next());
            {
                if (opcao == 1) {
                    System.out.println("Ok! então você deseja fazer uma soma  " +
                            "   Por favor digite dois números que deseja somar:");
                } else {
                    if (opcao == 2) {
                        System.out.println("Ok! então você deseja fazer uma subtração  " +
                                "   Por favor digite dois números que deseja subtrair:");
                    } else {
                        if (opcao == 3) {
                            System.out.println("Ok! então você deseja fazer uma divisão  " +
                                    "   Por favor digite dois números que deseja Dividir:");
                        } else {
                            if (opcao == 4) {
                                System.out.println("Ok! então você deseja fazer uma multiplicação  " +
                                        "   Por favor digite dois números que deseja multiplicar:");

                            } else {
                                System.out.println("O valor digitado não é válido...");

                            }
                        }
                    }
                }
            }

            Double n1 = Double.parseDouble(leitor.next());
            Double n2 = Double.parseDouble(leitor.next());

            switch (opcao) {
                case 1:
                    System.out.println("A soma dos dois valores é: " + (n1 + n2));
                    break;
                case 2:
                    if (n1 < n2) {
                        System.out.println("Não sou capaz de fazer essa conta!");
                    } else {
                        System.out.println("A subtração dos dois valores é: " + (n1 - n2));
                    }
                    break;
                case 3:
                    if (n2 == 0) {
                        System.out.println("Não sou capaz de fazer essa conta!");
                    } else {
                        System.out.println("A divisão dos dois valores é: " + (n1 / n2));
                    }
                    break;
                case 4:
                    System.out.println("A multiplicação dos dois valores é: " + (n1 * n2));
                    break;
                default:
                    System.out.println("Não sou capaz de fazer essa conta!");
                    break;

            }
            System.out.println("Deseja fazer uma nova operação? \n Digite (1) pra Sim e (2) pra Não.");
            // resposta = Integer.parseInt(leitor.next());
            resposta = (leitor.next());
        } while(resposta.equals("S") || resposta.equals("s"));
        System.out.println("Obrigado pela preferência");


    }
}

