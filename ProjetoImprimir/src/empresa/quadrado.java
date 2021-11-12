package empresa;

public class quadrado implements Imprimivel {
	int medidaLado;

	public quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("Quadrado");
		System.out.println("medida dos lados :" + medidaLado);
		System.out.println("Area :" + (4*medidaLado));
		
	}

}
