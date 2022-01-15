package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Faça um programa que pergunte quando você ganha por hora e o numero de horas trabalhadas no mês;
// Calcule e mostre o total do seu salario no referido mes

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre a quantidade de horas trabalhadas: ");
		double numeroHora = scan.nextDouble();
		
		double salario = valorHora * numeroHora;
		
		System.out.println("O salário será de: " + salario);
		
	}

}
