/**
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;

public class MediaAlunos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Quant = 0, Acima = 0, Abaixo = 0, Maior = 0, Menor = 1000, Media = 0;
		
		while(true) {
			String[] Entrada = sc.nextLine().split(" ");
			
			if (Entrada[0].equals("-")){
				break;
			}
			
			String Aluno = Entrada[0];
			int Nota = Integer.parseInt(Entrada[1]);
			
			Media += Nota; 
			Quant += 1;
			
			if (Nota >= 700) {
				Acima += 1;
			}
			
			else {
				Abaixo += 1;
			}
			
			if (Nota > Maior) {
				Maior = Nota;
			}
			if (Nota < Menor) {
				Menor = Nota;
			}
		}
		
		Media /= Quant;
		
		System.out.println("maior: " + Maior);
		System.out.println("menor: " + Menor);
		System.out.println("media: " + Media);
		System.out.println("acima: " + Acima);
		System.out.println("abaixo: " + Abaixo);	
	}
}
