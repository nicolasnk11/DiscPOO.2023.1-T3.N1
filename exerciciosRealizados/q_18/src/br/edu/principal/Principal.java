package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a;
		int b;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro maior que 1: ");
		b = sc.nextInt();
		
		for (a = 1; a <= b; a++) {
			if (b % a == 0) {
				c = c + 1;
			}
		}
		
		if (c > 2) {
			System.out.println("Número não primo.");
		} else {
			System.out.println("Número primo.");
		}
	}
}
