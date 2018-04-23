/*
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;

public class PalavraMaior {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String Palavra1 = Sc.nextLine();
		String Palavra2 = Sc.nextLine();
		
		String Menor = Palavra1;
		String Maior = Palavra1;
		
		if (Palavra1.length() < Palavra2.length()) {
			Maior = Palavra2;
		}
		
		else if (Palavra2.length() < Palavra1.length()) {
			Menor = Palavra2;
		}
	
		System.out.println(Menor);
		System.out.println(Maior);
	}
	

}
