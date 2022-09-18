/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaa;

/**
 *  Desafio Caixa Eletrônico
 *
 * Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre
 * três possíveis itens: Pedra, Papel ou Tesoura.
 *
 * O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores
 * informa o resultado da partida.
 *
 * As regras são as seguintes:
 *
 * Pedra empata com Pedra e ganha de Tesoura Tesoura empata com Tesoura e ganha
 * de Papel Papel empata com Papel e ganha de Pedra
 *
 * @author Koji
 */
import java.util.Scanner;

public class JoKenPo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Jogador 1 faca sua escolha");
        System.out.println("1: Pedra");
        System.out.println("2: Papel");
        System.out.println("3: Tesoura");
        int jogador1 = scan.nextInt();

        System.out.println("Jogador 2 sua vez, faca sua escolha");
        System.out.println("1: Pedra");
        System.out.println("2: Papel");
        System.out.println("3: Tesoura");
        int jogador2 = scan.nextInt();

        switch (jogador1) {
            case 1 -> {
                if (jogador2 == 1) {
                    System.out.println("Empate!");
                } else if (jogador2 == 2) {
                    System.out.println("Jogador 2 Venceu!!!");
                } else if (jogador2 == 3) {
                    System.out.println("Jogador 1 Venceu!!!");
                }
            }

            case 2 -> {
                if (jogador2 == 1) {
                    System.out.println("Jogador 1 Venceu!!!");
                } else if (jogador2 == 2) {
                    System.out.println("Empate!!!");
                } else if (jogador2 == 3) {
                    System.out.println("Jogador 2 Venceu!!!");
                }
            }

            case 3 -> {
                if (jogador2 == 1) {
                    System.out.println("Jogador 2 Venceu!!!");
                } else if (jogador2 == 2) {
                    System.out.println("Jogador 1 Venceu!!!");
                } else if (jogador2 == 3) {
                    System.out.println("Empate!!!");
                }
            }
        }
    }

}
