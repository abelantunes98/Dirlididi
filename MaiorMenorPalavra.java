/*
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;

public class MaiorMenorPalavra {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
	
		String[] Lista = new String[5];
		
		for (int i = 0; i < 5; i ++){
			Lista[i] = Sc.nextLine();
		}
		
		String Maior = Lista[0];
		String Menor = Lista[0];
		
		for (String palavra : Lista){
			if (palavra.length() > Maior.length()){
				Maior = palavra;
			} else if (palavra.length() < Menor.length()){
				Menor = palavra;
			}
		}
		
		System.out.println(Menor);
		System.out.println(Maior);
	}

}

