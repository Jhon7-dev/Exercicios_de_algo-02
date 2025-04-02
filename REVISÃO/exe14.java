


/* PARA 30 ALUNOS DA TURMA DE ALGORITMOS E PROGRAMAÇÃO, RECEBER A MÉDIA DE TEORIA E A MÉDIA DE LABORATÓRIO, CALCULAR A MÉDIA FINAL (FINAL = TEORIA*0.6 + LABORATÓRIO*0.4) E IFNORMAR SE CADA UM FOI BEM (FINAL>=7),RAZOÁVEL (5<=FINAL<7) OU MAL (FINAL<5). */

import java.util.Scanner;

public class exe14 {
     public static void main(String[] args) {
         
          Scanner scn = new Scanner (System.in);

          double teoria;
          double lab;
          //double mediafinal;
          double aluno=30;
          double last = 1;

          
          for(aluno = 30; aluno > 0; aluno--){
               System.out.println("\nDIGITE SUA MÉDIA DO LABORATÓRIO");
               lab=scn.nextDouble();
               
               System.out.println("\nDIGITE SUA MÉDIA DE TEORIA");
               teoria=scn.nextDouble();

           double  mediafinal = teoria*0.6 + lab*0.4;
           if (mediafinal >= 7){
                 
           
               System.out.println("\nBEM! PARABÉNS!");
              
              } else if (mediafinal  >=5 && mediafinal  < 7) {
    
                   System.out.println("\nRAZOÁVEL! ESTUDE MAIS!");
    
              
              }else{
                   System.out.println("\n MAL! PRECISA SE DEDICAR MAIS!");
          }
          }         
     }
}
