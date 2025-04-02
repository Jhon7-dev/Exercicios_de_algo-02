
import java.util.Scanner;


/*FAÇA UM PROGRAMA QUE EXIBA A TABUADA DE UM NÚMERO INFORMADO PELO USUÁRIO */


public class exe7 {
      
     public static void main(String[] args) {

          Scanner scn = new Scanner (System.in);
         

           int i = 1;

           
          int p = 0 ; // O NÚMERO P QUE EU DIGITAR FICARÁ FIXXO!!!!!!!!!!!

          System.out.println("DIGITE UM NÚMERO");
          p=scn.nextInt();

           int cont = 10; // 

           int multi = 1;
          
          for(i = 1 ; i <= cont ; i++  ){ // MEU INCREMENTO TA INDO DE 1 EM 1, OU SEJA , TA AUMENTANDO DE UM EM UM (1,2,3,...) ATÉ O VALOR DA CONDIÇÃO QUE EU ESTABELECI QUE É 10.
               
               multi = p * i;
               
             
               System.out.println  (  p  + " x " +  i  + " = " +  multi);

          }
     }    
}
