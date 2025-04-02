
/*SOLICITA QUANTOS NÚMEROS O USÚARIO DESEJA INFORMAR, RECEBER CADA UM DELES E MOSTRAR A MÉDIA ARITMÉTICA NO FINAL */



import java.util.Scanner;

public class exe17 {
     public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);
 
          int cont=1;

          int soma = 0;

          int media;

          int p;

          int i = 1;
          
          System.out.println("QUANTOS NÚMEROS VOCÊ DESEJA SOLICIATAR?");
          p=scn.nextInt();

          int c = 1;

          while (cont <= p){
               System.out.println("DIGITE O " + cont +  " VALOR ");
               
              i=scn.nextInt();
              cont++;
               soma +=i;
          }
           System.out.println("A MÉDIA ARITMÉTICA É " + soma/p);   
     }
}
