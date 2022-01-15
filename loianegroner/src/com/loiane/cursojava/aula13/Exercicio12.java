package com.loiane.cursojava.aula13;

import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu
//peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal é: " + pesoIdeal);
		
	}
}
