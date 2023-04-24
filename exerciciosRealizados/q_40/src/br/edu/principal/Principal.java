package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
     int m, n, soma;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor para m:");
	    m = sc.nextInt();
	    System.out.println("\nDigite o valor para n:");
	    n = sc.nextInt();
	   
	    while (m < n){
	      soma = 0;
	      for (int i = m; i <= n; i++){
	        soma = soma + i;
	      }
	      System.out.println("\nA soma entre os números do intervalo dos dois números de m e n é igual: " + soma + ".\n");
	      System.out.println("Digite o valor para m:");
	      m = sc.nextInt();
	      System.out.println("\nDigite o valor para n:");
	      n = sc.nextInt();
	    }
	    if (m > n) {
	      System.out.println("o numero atribuido para m é maior que n, por isso o programa foi encerrado");
	    }
	    if (m == n) {
		      System.out.println("O valor atribuido a m é igual a n, por isso o programa foi encerrado");
		   }
	  }   
}
