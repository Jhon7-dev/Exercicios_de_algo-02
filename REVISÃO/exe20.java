/*A PREFEITURA DE UMA CIDADE DE 15 HABITANTES FEZ UMA PESQUISA COLETANDO SALÁRIO E NÚMERO DE FILHOS DE CADA UM. A PREFEITURA DESEJA SABER:
 * - MÉDIA DO SALÁRIO DA POPULAÇÃO
 * - MÉDIA DO NÚMERO DE FILHOS 
 * - MÉDIA DO NÚMERO DE FILHOS 
 * - MAIOR SALÁRIO
 * - PERCENTUAL DE PESSOAS COM SALÁRIO ATÉ 500
 */

import java.util.Scanner;

public class exe20 {
      public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);    

          
          int habitantes = 15;
          int cont = 1;
          int soma;
          int n=0;
          double salario = 0 ;
          double filhos = 0;
          double  menor = 0;
          double maior = 0;
          while ( cont <= 15 ){
//

               System.out.println( "\n"  + cont + " HABITANTE");
               
               System.out.println("\nDIGITE SEU SALÁRIO:");
               salario = scn.nextDouble();
               System.out.println("\nDIGITE QUANTOS FILHOS VOCÊ TEM:");
               filhos=scn.nextDouble();

                cont++;    

          }    if (salario == 0){

               maior = salario;
               menor = salario;

               }else if (salario < menor){

                    menor = salario;
               } if(salario > maior );{
                    maior = salario;
               }
               System.out.println("A MÉDIA DE SALÁRIO DA POPULAÇÃO É " + salario/habitantes);           
               System.out.println("A MÉDIA DE NÚMERO DE FILHOS É " + filhos/habitantes);
               System.out.println (" O MAIOR SALÁRIO É  " + maior );



          }
}