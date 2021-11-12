package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		desktop compA = new desktop(8,4,600);
		notebook compB = new notebook(8,4,20);
		
		Computador comp;
		
		ArrayList <Computador> listaComputadores = new ArrayList();
		
		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new desktop(16,8,800));
		listaComputadores.add(new notebook(16,8,16));
		
		
		double total=0;
		
		for(Computador c :listaComputadores) {
			total+=c.calculaValor();
		}
		
		System.out.println("Total do valor :" + total);
		
		//comp = compA;
		//System.out.println("Valor :" + comp.calculaValor());
		//comp = compB;
		//System.out.println("-------------------");
		//System.out.println("Valor :" + comp.calculaValor());//
		
		
		
		

	

	}
}