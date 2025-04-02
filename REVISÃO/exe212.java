import java.util.Scanner;

public class exe212 {
     
     public static void main(String[] args) {
         
          System.out.println("hello");
 
          Scanner scn = new  Scanner (System.in);

          int cadastro =0;
          int cont = 1;
          int peso =1 ;
          int peso_limite;
          Character sexo ;
          int f = 0;
          int m  = 0;
          
          System.out.println("QUANTAS PESSOAS VAMOS CADASTRAR?");
          cadastro=scn.nextInt();
          System.out.println("DIGITE O PESO DE REFERÊNCIA:");
          peso_limite = scn.nextInt();

          int pessoas = 0;

          while(cont <= cadastro){

               System.out.println("\nPESSOA " + cont + " DE " + cadastro);
               System.out.println("PESO:");
               peso = scn.nextInt();
               System.out.println("SEXO:[M/F]");
               sexo =scn.next().charAt(0);

               f = f + 1; //NUNCA ESQUECER DESSA PASSAGEM NO CARACTER
               m = m + 1  ;


               if (peso > peso_limite){

                    System.out.println("\n===PESO ACIMA DO LIMITE DE " +  peso_limite + "===");

                    

               } if (peso ==  peso_limite){

                    System.out.println("\n===PESO NO LIMITE DE "+ peso_limite + "===");
                    
               } else if ( peso < peso_limite){

                    System.out.println("\n===PESO ABAIXO DO LIMITE DE " + peso_limite + "===");
               }
               if (sexo == 'm'|| sexo == 'M'){

                         m++;
               } if (sexo == 'f' || sexo == 'F')
                         f++;
               
               pessoas  = cont + 1;
               cont++;
               
          }
               
           System.out.println("AO TOTAL TEMOS " + pessoas  + " ACIMA DO LIMITE DE " + peso_limite);    
           System.out.println(" E DESSAS PESSOAS "+ m + " SÃO HOMENS E " + f + "MULHERES");
               
               
               
               
     }
}
