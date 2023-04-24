package br.edu.principal;
import java.util.Scanner;
public class Principal {

public static void main(String[] args) {
	
	   System.out.println("Número e altura do aluno mais alto e do aluno mais baixo entre 10 estudantes.\n");
	
   int num = 0, altura = 0, num_maior = 0, num_menor = 0, altura_maior = 0, altura_menor = 0;
  
   Scanner sc = new Scanner (System.in);

   for (int cont = 1; cont <= 10; cont++){
	   	System.out.println("Digite o valor do número do aluno:\n");
	   	num = sc.nextInt();
	   	altura = sc.nextInt();

	   	if(cont== 1) {
	   		num_maior = num;
	   	   num_menor = num;
	   	   altura_menor = altura;
	   	   altura_maior = altura;
	   	}
	   	else {
	   	
	   	
	   		if (altura > altura_maior) {
	   			altura_maior = altura;
	   			num_maior = num;
	   			}

	   		else if (altura < altura_menor){
	   			altura_menor = altura;
	   			num_menor = num;
	   			}
	   		}
	   	
	   	
   }
 
   System.out.println("ALUNO MAIS ALTO \n ");
   		
   System.out.println("Número: "+ num_maior + "\nAltura: "+ altura_maior+ " centímetros de altura\n");
   System.out.println("ALUNO MAIS BAIXO\n");
  
   System.out.println("Número: "+ num_menor+ "\nAltura: "+ altura_menor + " centímetros de altura");

}

}