package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Fa�a um programa que pergunte quando voc� ganha por hora e o numero de horas trabalhadas no m�s;
// Calcule e mostre o total do seu salario no referido mes

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre a quantidade de horas trabalhadas: ");
		double numeroHora = scan.nextDouble();
		
		double salario = valorHora * numeroHora;
		
		System.out.println("O sal�rio ser� de: " + salario);
		
	}

}
