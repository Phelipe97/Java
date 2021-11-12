package Phelipe;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Por favor digite o seu peso :");
		Scanner teclado = new Scanner(System.in);
		float peso = teclado.nextFloat();
		
		System.out.println("Por favor digite a sua altura :");
		float altura = teclado.nextFloat();
		
		float IMC = peso/(altura*altura);
		
		System.out.println("Seu imc eh:" + IMC);
	}

}
