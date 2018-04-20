import java.util.Scanner;

public class Maior_que_media {
	public static void main(String[] args) {
		
		int media = 0;
		Scanner sc = new Scanner(System.in);
		String numeros = sc.nextLine();
		
		String array[] = new String[5];
		int arrayint[] = new int[5];
		array = numeros.split(" ");
		
		for (String numero : array) {  // o split quebra uma string em uma sequencia de strings
			int numeroi = Integer.parseInt(numero);
			arrayint.add(numeroi);
			media += numeroi / 5;	
		}
		
		for (int numero : arrayint) {
			if ()
		}
	
	}
	

}
