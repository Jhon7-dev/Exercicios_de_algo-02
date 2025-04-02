
import java.util.Scanner;


     /* DESENVOLVA UM ALGORITMO QUE RECEBE UMA OPÇÃO DO USUÁRIO (METROS, QUILÔMETROS,
CENTÍMETROS) E CONVERTE UMA QUANTIDADE PARA A UNIDADE ESCOLHIDA USANDO */


public class exe3 {
     public static void main(String[] args) {
          
          Scanner scn = new Scanner(System.in);
          int opcao;
          double metro1,metro2,km1,km2,cm1,cm2,num1;
          
          System.out.println(" 1- METROS PARA CM ");
          System.out.println(" 2- METROS PARA KM ");
          System.out.println(" 3- KM PARA METROS ");
          System.out.println(" 4- KM PARA CM  ");
          System.out.println(" 5- CM PARA KM  ");
          System.out.println(" 6- CM PARA METROS SÃO ");
          
          System.out.println("DIGITE UMA OPÇÃO DE CONVERSÃO");
          opcao=scn.nextInt();
          
          System.out.println(" VOCÊR ESCOLHEU A OPÇÃO " + opcao);
          System.out.println("/n==========================");
          
          System.out.println("DIGITE UM NÚMERO");
          num1=scn.nextDouble();

          metro1 = num1 * 100;
          metro2 = num1 / 1000;
           
          km1 = num1 * 1000;
          km2 = num1 * 100000;

          cm1 = num1 / 10000;
          cm2 = num1 / 100;

          switch (opcao) {
              case 1 : System.out.println("METROS PARA CM SÃO : " +  metro1);
              break;

               case 2 : System.out.println(" METROS PARA  KM SÃO : " + metro2);
               break;

               case 3 : System.out.println(" KM PARA METROS SÃO : " + km1);
               break;

               case 4: System.out.println(" KM PARA CM SÃO : " + km2 );
               break;

               case 5 : System.out.println("CM PARA KM SÃO : " + cm1);
               break;

               case 6 : System.out.println("CM PARA METROS SÃO : " + cm2);
               break;
               
              default: System.out.println("OPÇÃO INVÁLIDADE!");
              break;
                  
          }










     }
}
