


/* RECEBER DOIS NÚMEROS INTEIROS E EXIBIR TODOS OS NÚMEROS INTEIROS EXISTENTES ENTRE ELES */

import java.util.Scanner;


public class exe11 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          int i = 0;
          int p;

          System.out.println("digite um número");
          i=scn.nextInt();
          System.out.println("digite outro número");
          p=scn.nextInt();

          int cont = 1;
          int soma = i + 1;

          for( cont = soma ; cont < p; cont++ ){

               
               System.out.println(  "\n OS NÚMEROS INTEIROS SÃO : "   +  cont  );
          }
     }
}
