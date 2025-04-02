
import java.util.Scanner;


/*DIGITE 5 VALORES,CALCULE A MÉDIA E DIGA QUANTOS SÃO PARES E ÍMPARES.  */

public class exe16 {
     public static void main(String[] args) {

          Scanner scn = new Scanner ( System.in);
          int num = 0;
         
          int p = 0;
          int i = 0;
          int c = 1;
           
          System.out.println("PARES E ÍMPARES");
          System.out.println("\n==============");
          
          while(c <= 5){

          System.out.println("DIGITE O " + c + " NÚMERO " );
          num=scn.nextInt();
         
          c++;
         

               if(num %2==0 ){
                   
                    p++;

               }else{

                    i++;

               }
               } 
               System.out.println("os números pares foram " + p );
               System.out.println("os numeros impares foram " + i );
          }

         
     }
 
