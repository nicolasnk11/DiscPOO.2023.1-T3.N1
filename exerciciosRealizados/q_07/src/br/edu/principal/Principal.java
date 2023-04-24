package br.edu.principal;

import java.util.Scanner;

 public class Principal
 {
   public static void main(String args[])
   { 
    
    int fim, i, j, numTerm, denom = 1, fator = 0, expo, den = 0;
    double x, result = 0.0;
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Digite o número de termos: ");
    numTerm = sc.nextInt();
    System.out.println("Digite um valor positivo: ");
    x = sc.nextDouble();
    
    for (i = 1; i <= numTerm; i++){
      fim = denom;
      fator = 1;
      for (j = 1; j <= fim; j++){
        fator = fator * j;
      }
    
      expo = i + 1;
      if (expo % 2 == 0){
      result = result - (Math.pow(x, expo)/fator);
      }
      else{
        result = result + (Math.pow(x, expo)/fator);
      }
      if (denom == 4){
        den = -1;
      }
      if (denom == 1){
        den = 1;
      }
      if (den == 1){
        denom = denom + 1;
      }
      else{
        denom = denom - 1;
      }
    }
    System.out.println("\nO valor final da série será " + result);
       
   }
 }
