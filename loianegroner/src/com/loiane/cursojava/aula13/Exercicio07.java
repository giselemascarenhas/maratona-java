package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que calcule a area de um quadrado
// em seguida, mostre o dobro desta area para o usuário

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double quadrado = scan.nextDouble();
		
		quadrado = Math.pow(quadrado, 2) * 2;
		
		System.out.println("O dobro da área do quadrado é: " + quadrado);

	}

}
