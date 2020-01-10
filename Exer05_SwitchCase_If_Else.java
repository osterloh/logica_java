package exercicios;

import java.util.Scanner;

public class Exer05_SwitchCase_If_Else {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float v1, v2;
		int opc;
		
		System.out.print("Informe o 1o valor: ");
		v1 = in.nextFloat();
		System.out.print("Informe o 2o valor: ");
		v2 =in.nextFloat();
		
		System.out.println("Escolha uma opcao aritmetica:");
		System.out.println("1 -> Somar os valores");
		System.out.println("2 -> Subtrair os valores");
		System.out.println("3 -> Multiplicar os valores");
		System.out.println("4 -> Dividir os valores");
		System.out.print("> ");
		opc = in.nextInt();
		
		switch (opc) {
			case 1:
				float somar = v1 + v2;
				System.out.print(v1 + " + " + v2 + " = " + somar);
				
				if (somar % 2 == 0) {
					System.out.print(" - PAR");
				
				} else {
					System.out.println(" - IMPAR");
				
				}
				
			break;
				
			case 2:
				float subtrair = v1 - v2;
				System.out.print(v1 + " - " + v2 + " = " + subtrair);
				
				if (subtrair % 2 == 0) {
					System.out.print(" - PAR");
				
				} else {
					System.out.println(" - IMPAR");
				
				}
				
			break;
				
			case 3:
				float multiplicar = v1 * v2;
				System.out.print(v1 + " * " + v2 + " = " + multiplicar);
				
				if (multiplicar % 2 == 0) {
					System.out.print(" - PAR");
				
				} else {
					System.out.println(" - IMPAR");
				
				}
				
			break;
				
			case 4:
				float dividir = v1 / v2;
				System.out.print(v1 + " / " + v2 + " = " + dividir);
				
				if (dividir % 2 == 0) {
					System.out.print(" - PAR");
				
				} else {
					System.out.println(" - IMPAR");
				
				}
			break;
	
			default:
				System.out.println("Opcao invalida!!!");
				
			break;
		}

	}

}
