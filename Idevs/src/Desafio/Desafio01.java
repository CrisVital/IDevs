package Desafio;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String  x , a;
		int soma = 0;
		
		

		System.out.println("Informe a palavra: ");
		x = sc.next();	
		a = x.toUpperCase();
		
		 if(a.contains("A")) {
			 soma += 1;
		 } 
		 if(a.contains("B")) {
			 soma += 3;
		 } 
		 if(a.contains("C")) {
			 soma += 3;
		 }
		 if(a.contains("D")) {
			 soma += 2;
		 }
		 if(a.contains("E")) {
			 soma += 1;
		 }
		 if(a.contains("F")) {
			 soma += 4;
		 }
		 if(a.contains("G")) {
			 soma += 2;
		 }
		 if(a.contains("H")) {
			 soma += 4;
		 }
		 if(a.contains("I")) {
			 soma += 1;
		 }
		 if(a.contains("J")) {
			 soma += 8;
		 }
		 if(a.contains("K")) {
			 soma += 5;
		 }
		 if(a.contains("L")) {
			 soma += 1;
		 }
		 if(a.contains("M")) {
			 soma += 3;
		 }
		 if(a.contains("N")) {
			 soma += 1;
		 }
		 if(a.contains("O")) {
			 soma += 1;
		 }
		 if(a.contains("P")) {
			 soma += 3;
		 }
		 if(a.contains("Q")) {
			 soma += 10;
		 }
		 if(a.contains("R")) {
			 soma += 1;
		 }
		 if(a.contains("S")) {
			 soma += 1;
		 }
		 if(a.contains("T")) {
			 soma += 1;
		 }
		 if(a.contains("U")) {
			 soma += 1;
		 }
		 if(a.contains("V")) {
			 soma += 4;
		 }
		 if(a.contains("W")) {
			 soma += 4;
		 }
		 if(a.contains("X")) {
			 soma += 8;
		 }
		 if(a.contains("Y")) {
			 soma += 4;
		 } 
		 if(a.contains("Z")) {
			 soma += 10;
		 }
			 
		System.out.println(soma);
		

		sc.close();
	}

}
