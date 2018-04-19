/**
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		double result = 0;
		Scanner sc = new Scanner(System.in);
		String operacao = sc.nextLine();
		
		if (operacao != "+" && operacao != "-" && operacao != "*" && operacao != "/") {
			System.out.println("ENTRADA INVALIDA");
		}
		
		else {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			
			if (operacao.equals("+")) {
				result = valor1 + valor2;
			}
			
			else if (operacao.equals("-")) {
				result = valor1 - valor2;
			}
			
			else if (operacao.equals("*")) {
				result = valor1 * valor2;
			}
			
			else if (operacao.equals("/")) {
				if (valor2 == 0) {
					System.out.println("ERRO");
				}
				else {	
					result = valor1 / valor2;
					System.exit(0);
				}
				
			System.out.println("RESULTADO: " + result);
			}
		}
	}
	
}
