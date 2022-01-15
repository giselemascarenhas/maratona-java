package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que peça o tamanho de um arquivo para download em MB
// e a velocidade de um link de internet em MBPS
// Calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos)

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo em MB: ");
		double tamanho = scan.nextDouble();
		
		System.out.println("Entre com a velocidade em MBPS: ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamanho / velocidade;
		
		System.out.println("O tempo aproximado de download é de:" + tempo);

	}

}
