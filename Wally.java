/**
* Laboratório de Programação 2 - Lab 1
*
* @author Abel Antunes de Lima Neto - 117210287
*/

import java.util.Scanner;
public class Wally {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		while (true) {
			String[] Lista = Sc.nextLine().split(" ");
			String Parar = "nao";
			String Provavel = "?";
			
			if (Lista[0].equals("wally")) {
				break;
			}

			
			if (Parar.equals("sim")) {
				break;
			}
			
			for (String Palavra: Lista) {	
				
				if (Palavra.length() == 5) {
					Provavel = Palavra;
				}
			}
			System.out.println(Provavel);
		}
	}
}
