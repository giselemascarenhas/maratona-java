package com.loiane.cursojava.aula13;

import java.util.Scanner;

//Faça um programa que converta metros em centimetros

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de metros: ");
		int metros = scan.nextInt();

		int cm = metros * 100;
		
		System.out.println("O Valor em centimetros é: " + cm);

	}

}
