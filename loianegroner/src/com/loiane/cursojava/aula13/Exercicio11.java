package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que peça 2 inteiros e um numero real
// Calcule e mostre: 
// a) o produto do dobro do primeiro com metade do segundo
// b) a soma do triplo do primeiro com o terceiro;
// c) o terceiro ao cubo

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro inteiro: ");
		int A = scan.nextInt();
		
		System.out.println("Digite o segundo inteiro: ");
		int B = scan.nextInt();
		
		System.out.println("Digite o numero real: ");
		double real = scan.nextDouble();
		
		
		 
		System.out.println("A) =" + ((A + A) * (B/2))); 
		
		System.out.println("B) =" + ((A * 3) + real));
		
		System.out.println("C) =" + Math.pow(real, 3));
	}

}
