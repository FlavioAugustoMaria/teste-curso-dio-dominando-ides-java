package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		//Gato gato = new Gato("a", "b", 0);
		Gato gato = new Gato();
		Livros livro = new Livros();

		//System.out.println(gato.getCor());
		System.out.println(gato);		
		System.out.println(livro);

		/*
		 * int a = 2; int b = 3; System.out.println("Hello Word! " + (a+b));
		 */
	}

}

class Livros {
	private String nome;
	private String paginas;
}