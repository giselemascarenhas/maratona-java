package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que peça o raio de um circulo, calcule e mostre sua area

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O valor da área de um circulo é: " + area);
		
	}

}
