
import java.util.Scanner;



 /*FATORIAL */


public class exe5 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner(System.in);

          int i = 1;

          int n;

          int fat = 1;

          System.out.println("QUAL O NÚMERO DESEJA CALCULAR O FATORIAL ?");
          
          n=scn.nextInt();

          if(n>=0){
               for ( i = 1; i<=n; i++){
                    fat = fat * i;

               }
                    System.out.println("FATORIAL É :" + fat);    
          }else{
               System.out.println("INFORME NÚMEROS A PARTIR DE ZERO!");
          }
     }    
}
