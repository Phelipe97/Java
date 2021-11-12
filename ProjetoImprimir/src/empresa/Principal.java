package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario ("mario","455.566.399-45");
		carro c = new carro("palio","cinza",2);
		quadrado q = new quadrado(10);
		
		ArrayList<Imprimivel>lista =new ArrayList();
		
		lista.add(f);
		lista.add(c);
		lista.add(q);
		
		
		//Imprimivel i = f;
		//i.imprimir();
		//i=c;
		//i.imprimir();
		//i=q;

	}

}
