package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont, num1, num2, i;
		
		Scanner sc = new Scanner(System.in);
		for (cont = 1; cont <= 5; cont++) {
			System.out.println("Insira o primeiro número do par aqui: ");
			num1 = sc.nextInt();
			System.out.println("Insira o segundo número do par aqui: ");
			num2 = sc.nextInt();
			System.out.println("os numeros pares de "+ num1 + " à " + num2 + " são: ");
			for (i = num1; i <= num2; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}
		}

		}

	}