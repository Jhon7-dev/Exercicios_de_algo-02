
import java.util.Scanner;

public class exe1 {

     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int adicao,subtracao,multiplicacao,divisao,num1,num2,opcao;
           

          System.out.println("TABUADA");
          System.out.println("-------------------------\n");
          System.out.println("\n 1 - ADIÇÃO");
          System.out.println("\n 2 - SUBTRAÇÃO");
          System.out.println("\n 3 -  MULTIPLICAÇÃO");
          System.out.println("\n 4 - DIVISÃO");
          System.out.println("--------------------------\n");
          
          System.out.println("DIGITE SUA OPCÃO :");
          opcao=scn.nextInt(); 
          
          System.out.println(" VOCÊ ESCOLHEU A OPÇÃO " + opcao);



     
          System.out.println("DIGITE UM NÚMERO");
          num1=scn.nextInt();
          System.out.println("DIGITE OUTRO NÚMERO");
          num2=scn.nextInt();

          adicao =  num1 + num2 ; 

          subtracao = num1 - num2 ; 

          multiplicacao = num1 * num2 ;

          divisao = num1 / num2;

          switch(opcao){

               case 1 : System.out.println ( " adição = "  + adicao);
               break;

               case 2 : System.out.println( " Subtração = " + subtracao);
               break;
               
               case 3: System.out.println(" multiplicação = " + multiplicacao);     
               break;

               case 4 : System.out.println(" Divisão = " + divisao);
               break;

               default: System.out.println("OPÇÃO INVÁLIDA!");
               break;
          }
     }

}