package teste_GFT;

import java.util.Scanner;

public class NumeroImpar {
	public static void main(String[] args) {
		int numeroInicial;
		int numeroFinal=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Digite o numero inicial: \n ");
		numeroInicial=input.nextInt();
		System.out.println("\nDigite o numero final ");
		numeroFinal=input.nextInt();
		
		
		
		for(int i=numeroInicial;i <=numeroFinal;i++) {
			if(i %2 == 1)
			System.out.println(i);
		}
			
		
		
	}
}
