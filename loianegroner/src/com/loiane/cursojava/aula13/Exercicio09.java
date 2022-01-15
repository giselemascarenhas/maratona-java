package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que peça a temperatura em Farenheit
// Transforme e mostre em graus Celsius

public class Exercicio09 {
	
	public static void main(String[] args) {
	
	System.out.println("Entre com um valor em grau Farenheit: ");
	Scanner scan = new Scanner(System.in);
	
	int temp = scan.nextInt();
	
	int C = (5 * (temp-32) /9);
	
	System.out.println("O valor em graus Celsius é de: " + C);
		
	}

}
