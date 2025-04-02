
/*RECEBER 10 NÚMEROS E, AO FINAL, INFORMAR QUANTOS SÃO POSITIVOS E QUANTOS SÃO NEGATIVOS */

import java.util.Scanner;

public class exe18 {
     public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);

          int i = 10;
          int cont = 1;
          int c = 0;
          int p;
          int positivo=0;
          int negativo=0;

          while(cont <= i){
               System.out.println("DIGITE " + cont + " NÚMERO ");
               p=scn.nextInt();
               cont++;

               if( p>0){
                    positivo++;
               } if( p < 0){
                    negativo++;
               }

          }
               System.out.println("AO TOTAL FORAM " + positivo);
               System.out.println("AO TOTAL FORAM " + negativo);
     }
}