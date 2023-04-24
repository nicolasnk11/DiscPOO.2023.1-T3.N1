package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int codigo,horaTrab;
		double valor,sal_min,sal_inicial,aux,sal_final;
		char turno,categ;
		Scanner sc = new Scanner(System.in);
		
		sal_min = 150;
		
		
		for(int cont = 1; cont<= 10;cont++) {
			
			System.out.println("============FUNCIONÁRIO "+ cont+"============\n");
			System.out.println("Digite o código do funcionário:\n");
			codigo = sc.nextInt();
			
			System.out.println("Digite o número de horas trabalhadas do funcionário:\n");
			horaTrab = sc.nextInt();
			
			System.out.println("\n============CATEGORIA==============\n");
			System.out.println("(O) - Operário\n(G) - Gerente\n");
			System.out.println("Digite a categoria do funcionário:\n");
			categ = sc.next().toUpperCase().charAt(0);
			
			System.out.println("\n============TURNO==============\n");
			System.out.println("(M) - Matutino\n(V) - Vespertino\n(N) - Noturno");
			System.out.println("Digite o turno do funcionário:\n");
			turno = sc.next().toUpperCase().charAt(0);
			
			
			while(categ != 'O' & categ != 'G') {
				
				System.out.println("\nCATEGORIA\n");
				System.out.println("(O) - Operário\n(G) - Gerente\n");
				System.out.println("Digite a categoria do funcionário:\n");
				categ = sc.next().toUpperCase().charAt(0);
				
			}
			
			while(turno != 'M' & turno != 'V' & turno != 'N') {
				
				System.out.println("\nTURNO\n");
				System.out.println("(M) - Matutino\n(V) - Vespertino\n(N) - Noturno");
				System.out.println("Digite o turno do funcionário:\n");
				turno = sc.next().toUpperCase().charAt(0);
				
			}
			
			
			if(categ == 'G') {
				if(turno == 'N') {
					valor = 0.18*sal_min;	
				}
				else {
					valor = 0.15*sal_min;
				}
			}
			else {
				if(turno == 'N') {
					valor = 0.13*sal_min;	
				}
				else {
					valor = 0.10*sal_min;
				}
			}
			
			sal_inicial = horaTrab * valor;
			
			
			if(sal_inicial <= 300) {
				aux = 0.20 * sal_inicial;
			}
			else if( sal_inicial > 300 & sal_inicial <= 600) {
				aux = 0.15 * sal_inicial;
			}
			else {
				aux = 0.05 * sal_inicial;
			}
			
			sal_final = sal_inicial +aux;
			System.out.println("\nDADOS\n");
			System.out.println("CÓDIGO: " +codigo+ "\n");
			System.out.println("HORA TRABALHADA: " +horaTrab+ "\n");
			System.out.println("VALOR DA HORA TRABALHADA: R$" +new DecimalFormat(".##").format(valor)+ "\n");
			System.out.println("SALÁRIO INICIAL: R$" +new DecimalFormat(".##").format(sal_inicial)+ "\n");
			System.out.println("AUXÍLIO-ALIMENTAÇÃO: R$" +new DecimalFormat(".##").format(aux)+ "\n");
			System.out.println("SALÁRIO FINAL: R$" +new DecimalFormat(".##").format(sal_final)+ "\n");		
		}
	}}
