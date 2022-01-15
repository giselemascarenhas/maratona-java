package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que peça em graus Celsius
// Transforme e mostre em Farenheit

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double celsius = scan.nextDouble();
		
		double F = (celsius * 1.8) + 32;
		
		System.out.println("O valor em graus farenheit é de: " + F);

	}

}
