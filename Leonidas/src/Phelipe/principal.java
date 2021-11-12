package Phelipe;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String msg;
		System.out.println("Digite o seu palpite:");

		
		int palpite = teclado.nextInt();
		
		
		while(palpite != 10000) {
			msg = palpite<10000?"um pouco mais ....":"um pouco menos ....";
			System.out.println(msg);
			/*
			if(palpite < 10000) {
			System.out.println("um pouco mais ....");
		}
			else {
				System.out.println("um pouco menos ....");		
	}*/
	System.out.println("Digite o seu proximo palpite:");
	palpite = teclado.nextInt();
	
	
		}
		System.out.println("Palpite correto");
}
}