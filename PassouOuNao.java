/**
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;

public class PassouOuNao{
	public static void main(String[] args) throws Exception{
		String pass = "";
		Scanner sc = new Scanner(System.in);
		String nota1 = sc.nextLine();
		String nota2 = sc.nextLine();
		
		// Para aceitar separador por ponto.
		double nota1f = Double.parseDouble(nota1.replace(',', '.'));
		double nota2f = Double.parseDouble(nota2.replace(',', '.'));
		
		if ((nota1f + nota2f) / 2 >= 7){
			 pass = "True!";
		}

		else {
			 pass = "False!";
		}

		System.out.println("pass: " + pass);
	}
}
