package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Fa�a um programa que calcule a area de um quadrado
// em seguida, mostre o dobro desta area para o usu�rio

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double quadrado = scan.nextDouble();
		
		quadrado = Math.pow(quadrado, 2) * 2;
		
		System.out.println("O dobro da �rea do quadrado �: " + quadrado);

	}

}
