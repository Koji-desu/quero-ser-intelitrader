/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaa;

/**
 *
 * Distribuição de Mictórios
 *
 * Este problema foi utilizado em 314 Dojo(s).
 *
 * Um problema enfrentado pelos homens no uso de mictórios em banheiros públicos
 * é o constrangimento causado por outro homem urinando no mictório ao lado. Uma
 * situação contrangedora é definida quando dois "mijões" deveriam ocupar
 * mictórios adjacentes.
 *
 * Dada uma quantidade de mictórios em um banheiro e a ocupação inicial deles
 * (informando em qual deles já existe um "mijão"), determine quantos "mijões"
 * ainda podem usar os mictórios e qual a posição deles antes para que não
 * ocorra uma situação constrangedora.
 *
 * @author Koji
 */
import java.util.Random;
import java.util.Scanner;
public class Mictorios {
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

       int mijao1 = (r.nextInt(10)+1);
       int mijao2 = (r.nextInt(10)+1);
        
       
        System.out.println("Ha dois mijoes e dez mictorios, escolha um para usar");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        
        int micEscolhido = scan.nextInt();
        
        if(micEscolhido == mijao1 || micEscolhido == mijao2){
            System.out.println("Esse mictorio ja está sendo usado por um mijao");
        } else if((micEscolhido+1) == mijao1 || (micEscolhido+1) == mijao2){
            System.out.println("!!!PERIGO!!!SITUACAO CONSTRANGEDORA!!!");
        } else if ((micEscolhido-1) == mijao1 || (micEscolhido-1)== mijao2){
            System.out.println("!!!PERIGO!!!SITUACAO CONSTRANGEDORA!!!");
        } else{
            System.out.println("Ta de boas pode usar que ninguem vai manjar");
        }

}}
