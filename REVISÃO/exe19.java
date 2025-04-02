import java.util.Scanner;


/* RECEBER 10 NÚMEROS E,AO FINAL, INFORMAR QUAL É O MAIOR E MENOR DELES. */


public class exe19 {
      public static void main(String[] args) {
        
          Scanner scn = new Scanner(System.in);

          int cont =1;
          int p = 10;
          int n;
          int maior = 0;
          int menor = 0;

          while(cont <= p){
               System.out.println("DIGITE O " + cont + " VALOR ");
               n=scn.nextInt();
               cont++;    
               
               if(n == 1){
                    maior = n;
                    menor =n;
                    
               } else if (n<menor){
                    menor = n;

               }if(n>maior)
               
               maior = n;
                               {
     
               }
          }

               System.out.println("DOS VALORES DIGITADOS O MAIOR VALOR É " + maior);
               System.out.println("DOS VALORES DIGITADOS O MENOR VALOR É " + menor);
     }
}