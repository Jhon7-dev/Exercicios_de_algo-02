
import java.util.Scanner;

public class exe15 { 

     public static void main(String[] args) {
         

          Scanner scn = new Scanner(System.in);



         // int cont=10;

          

          int menino = 0;
          int menina = 0;

         int  c = 1;
         

          while (c <= 5){

               System.out.println("DIGITE O SEXO : [m/f]");
               Character sexo ;
               sexo=scn.next().charAt(0);         
               c++;
                    
                 if (sexo== 'M'|| sexo== 'm'){
                         
                         menino++;

                } if ( sexo == 'F'|| sexo == 'f'){
                    menina++;
               }
                    
          }
          System.out.println("\nO TOTAL DE MENINAS FORAM " + menina + " E O TOTAL DE MENINOS FORAM " + menino );
          
     }
}
      
