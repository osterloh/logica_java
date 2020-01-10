package exercicios;

import java.util.Scanner;

public class Exer04_If_Else_For {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Informe um valor inteiro: ");
		valor = in.nextInt();
		
		if (valor <= 253) {
			for (int i = valor; i <= 253; i+=4) {
				System.out.println("Valor: " + i);
			}
			
		} else {
			for (int i = valor; i >= 253; i-=5) {
				System.out.println("Valor: " + i);
			}
		}

	}

}
