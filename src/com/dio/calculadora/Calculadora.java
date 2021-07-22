package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		//Solicitar informação do usuário através do teclado.
		//Para utilizar é necessário importar o pacote 'java.util.Scanner'.
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Informe o primeiro número:");
		a = scan.nextInt();
		System.out.println("Informe o segundo número:");
		b = scan.nextInt();		
		
		System.out.println("Soma dos números informados.........: " + soma(a, b));
		System.out.println("Subtração dos números informados....: " + subtracaoo(a, b) );
		System.out.println("Multiplicação dos números informados: " + multiplicacao(a, b));
		System.out.println("Divisão dos números informados......: " + divisao(a, b));
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracaoo(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}
	
	
}
