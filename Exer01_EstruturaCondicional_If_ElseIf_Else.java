package exercicios;

import java.util.Scanner;

public class Exer01_EstruturaCondicional_If_ElseIf_Else {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String opc;
		int parcelas = 0;
		float valorFinal, valorCarro, valorConvertido, real=4.27f, desconto;
		
		do {
			System.out.print("Informe a quantia de parcelas: ");
			parcelas = in.nextInt();
			System.out.print("Informe o valor do carro em Euro: ");
			valorCarro = in.nextFloat();
			
			if (parcelas == 1) {
				valorConvertido = real*valorCarro;
				desconto = (valorConvertido * 8/100);
				valorFinal = valorConvertido - desconto;
				System.out.println("O modelo Mazda RX-9 ira custar R$" + valorFinal + " - com 8% de desconto");
				
			} else if (parcelas > 1 && parcelas <= 4) {
				valorConvertido = real*valorCarro;
				desconto = (valorConvertido * 5/100);
				valorFinal = valorConvertido - desconto;
				System.out.println("O modelo Mazda RX-9 ira custar R$" + valorFinal + " - com 5% de desconto");
				
			} else if (parcelas > 4 && parcelas <= 8) {
				valorConvertido = real*valorCarro;
				desconto = (valorConvertido * 2/100);
				valorFinal = valorConvertido - desconto;
				System.out.println("O modelo Mazda RX-9 ira custar R$" + valorFinal + " - com 2% de desconto");
				
			} else if (parcelas > 8 && parcelas <= 12) {
				valorConvertido = real*valorCarro;
				System.out.println("O modelo Mazda RX-9 ira custar R$" + valorConvertido + " - preco a vista");
				
			} else if (parcelas >= 13) {
				valorConvertido = real*valorCarro;
				desconto = (valorConvertido * 2/100);
				valorFinal = valorConvertido + desconto;
				System.out.println("O modelo Mazda RX-9 ira custar R$" + valorFinal + " - com juros de 2%");
				
			}
			
			System.out.print("Deseja simular com outra quantia de parcelamento? [s/n]");
			opc = in.next();
			
		}while(opc.equalsIgnoreCase("s"));

	}

}
