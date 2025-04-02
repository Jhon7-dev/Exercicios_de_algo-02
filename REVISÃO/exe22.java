/* IMPLEMENTE UM PROGRAMA QUE CALCULE A OPERAÇÃO ARITMÉTICA SOLICITADA ENTRE
DOIS NÚMEROS */

import java.util.Scanner;

public class exe22 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);

          int soma,subtracao,divisao,multiplicacao;
          int a;
          int b;
          
          char operacao;
          char opcao;
          
          System.out.println("DIGITE A OPERAÇÃO DESEJADA");
          operacao = scn.next().charAt(0);
          
          System.out.println("DIGITE UM VALOR:");
          a=scn.nextInt();

          System.out.println("DIGITE OUTRO VALOR:");
          b=scn.nextInt();


          divisao = a/b;
          multiplicacao = a * b;
          subtracao = a - b;
          soma = a + b;

          switch (operacao) {
               case '+': System.out.println("A SOMA DE " + a + " + " + b + " É " + soma);
               break;

               case '-' : System.out.println("A SUBTRAÇÃO DE " + a  +  "-" +  b + "É" + subtracao);
               break;
               
               case '*': System.out.println("A MULTIPLICAÇÃO DE " + a + "*" + b + "É" + multiplicacao);
                   break;

               case '/' : System.out.println("A DIVISÃO DE " + a + " / " + b + " É "  + divisao);
               break;
          
               default: System.out.println("OPERAÇÃO INVÁLIDA");
                    break;
          } 
                

                    System.out.println("DESEJA CONTINUAR?");
                    opcao = scn.next().charAt(0);

                    if (opcao == 'S' || opcao == 's'){
                         System.out.println("LET´S AGAIN");

                         System.out.println("DIGITE A OPERAÇÃO DESEJADA");
                         operacao = scn.next().charAt(0);

                    }  if  (opcao == 'N' || opcao == 'n'){
                         System.out.println(" BUY, BUY !");

                    }
          
          }
     }
 