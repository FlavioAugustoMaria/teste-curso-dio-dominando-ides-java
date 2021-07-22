package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		//Solicitar informa��o do usu�rio atrav�s do teclado.
		//Para utilizar � necess�rio importar o pacote 'java.util.Scanner'.
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Informe o primeiro n�mero:");
		a = scan.nextInt();
		System.out.println("Informe o segundo n�mero:");
		b = scan.nextInt();		
		
		System.out.println("Soma dos n�meros informados.........: " + soma(a, b));
		System.out.println("Subtra��o dos n�meros informados....: " + subtracaoo(a, b) );
		System.out.println("Multiplica��o dos n�meros informados: " + multiplicacao(a, b));
		System.out.println("Divis�o dos n�meros informados......: " + divisao(a, b));
		
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
