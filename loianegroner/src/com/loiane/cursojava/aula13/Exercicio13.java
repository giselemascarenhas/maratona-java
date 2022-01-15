package com.loiane.cursojava.aula13;

import java.util.Scanner;

// Fa�a um programa que pergunte quanto voc� ganha por hora e o n. horas trabalhadas m�s;
// Calcule e mostre o total do sal�rio com desconto de 11% IR / 8% INSS / 5% Sindicato
// Mostrar: Salario bruto, vl pg INSS, vl pago Sindicato, salario liquido

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora trabalhada: ");
		double vlHora = scan.nextDouble();
		
		System.out.println("Entre com o n� de horas trabalhadas: ");
		int nHora = scan.nextInt();
		
		double salario = vlHora * nHora;
		
		double ir = ((salario * 11) / 100); 
		double inss = ((salario * 8) / 100);
		double sindicato = ((salario * 5) / 100);
		
		System.out.println("Sal�rio Bruto: " + salario);
		System.out.println("Valor pago de IR: " + ir);
		System.out.println("Valor pago de INSS: " + inss);
		System.out.println("Valor pago de Sindicato: " + sindicato);
		
		double salLiquido = salario - ir - inss - sindicato;
		System.out.println("Salario liquido: " + salLiquido);
		
		
	}

}
