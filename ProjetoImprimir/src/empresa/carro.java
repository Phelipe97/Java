package empresa;

public class carro implements Imprimivel{
	String marca;
	String cor;
	int portas;
	
	public carro(String marca, String cor, int portas) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
	}

	@Override
	public void imprimir() {
		System.out.println("Carro");
		System.out.println("Marcar :"+ marca);
		System.out.println("cor :"+ cor);
		System.out.println("portas :"+ portas);
		
	}
	
	

}
