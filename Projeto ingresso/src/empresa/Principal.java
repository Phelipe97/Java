package empresa;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock and Rio",200,100);

		iv.info();
		System.out.println("-------------------");
		Ingresso i = new Ingresso("Lollapaloza",250);
		
		i.info();
		
	}

}
