
import java.util.Scanner;


public class exe21 {
     public static void main(String[] args) {
          
          Scanner scn = new  Scanner (System.in);

          int cadastro =0;
          int cont = 1;
          int peso =1 ;

          Character sexo;

          while(cont <= cadastro){

               System.out.println("QUANTAS PESSOAS VAMOS CADASTRAR?");
               cadastro=scn.nextInt();
               System.out.println("DIGITE O PESO DE REFERÊNCIA:");
               peso = scn.nextInt();
               
               
               
               cont++;
               
          }


     }
}
