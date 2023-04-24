package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 int qtd = 0, num = 1, num2 = 0, qtdMtpl = 0;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um numero inteiro: ");
		 num2 = sc.nextInt();
		 System.out.println("digite a quantidade de multiplos que você deseja: ");
		 qtdMtpl = sc.nextInt();
		 
		  System.out.println("OS 5 PRIMEIROS MÚLTIPLOS DE " + num2);
		  while (qtd < qtdMtpl){
		    if ((num % num2 == 0)){
		      if (qtd < qtdMtpl - 1) {
		        System.out.print(num + ", ");
		        ++qtd;
		      }
		      else if (qtd == qtdMtpl - 1) {
		    	  System.out.print(num + ".");
		    	  ++qtd;
		      }
		    }   
		    ++num;
		  } 
	   }
}
