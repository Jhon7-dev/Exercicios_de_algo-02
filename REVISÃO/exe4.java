
import java.util.Scanner;


/*FAÇA UM ALGORITMO QUE SOLICITA UM NÚMERO DE 1 A 7 REPRESENTANDO UM DIA DA SEMANA E
INFORMA O NOME DO DIA CORRESPONDENTE. */


public class exe4 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          int dia;

          System.out.println(" DIGITE UM NÚMERO");
          
          dia=scn.nextInt();

          switch (dia) {
         case 1 : System.out.println("DOMINGO ");
                  break;
          case 2 : System.out.println(" SEGUNDA - FEIRA ");
                 break;
          case 3 : System.out.println(" TERÇA - FEIRA ");
                 break;
          case 4 : System.out.println(" QUARTA - FEIRA ");
                 break;
           case 5 : System.out.println("QUINTA - FEIRA ");
                 break;  
           case 6 : System.out.println(" SEXTA - FEIRA ");   
                break;
           case 7 : System.out.println( " SÁBADO " );    
               break;
               default: System.out.println("OPÇÃO INVÁLIDA!");
               break;
                
               }
          }   
}
