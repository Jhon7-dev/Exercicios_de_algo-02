
/*RECEBER A NOTA DE UM ALUNO NO MÓDULO 1 E NO MÓDULO 2 E CALCULAR A MÉDIA DELES. O USUÁRIO SÓ PODE DIGITAR NOTAS NO INTERVALO DE 0 A 10, CASO ELE DIGITE UM VALOR INVA´LIDO,DEVE DIGITAR NOVAMENTE */
import java.util.Scanner;


public class exe25 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner (System.in);

          int cont = 1;
          int i ;
          int media=0;
          int soma = 0;

          do {
              
               System.out.println("digite a sua  " + cont + " nota ");

               i=scn.nextInt();
             
               cont++;
               
               
               if ( i < 0 || i > 10){
                    
                    System.out.println("VALOR INVÁLIDO! DIGITE SUA NOTA NOVAMENTE: ");
                    
                    i = scn.nextInt(); {
                         
                    }
               }
               
               soma =  soma + i;
               
          }while(cont <= 4);
         
          media = soma/ 2;

          System.out.println("MEDIA DAS NOTAS SÃO " + media );

     } 
}
