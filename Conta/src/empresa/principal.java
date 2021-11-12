package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		contaBanco c1 = new contaBanco("Richard",5000);
		contaBanco c2 = new contaBanco("Jose",2000);
		
		System.out.println("digite um valor para transferir :");
		c1.info();
		c2.info();
		double valorTransferir = teclado.nextDouble();
		boolean sucessoLeitura = false;
		while(sucessoLeitura) {
				try {  
				   c1 .transferir(valorTransferir, c2);
				   c1.info();
				   c2.info();
				   sucessoLeitura = true;
				}catch(Exception e) {
					System.out.println("Ocorreu um erro,coloque outro valor");
					System.out.println(e.getMessage());
					valorTransferir = teclado.nextDouble();
					
		}
		
		}
		
		
	}

}
