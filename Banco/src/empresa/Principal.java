package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(1111,"Mario",2000,500);

		c1.info();
		
		if(!c1.sacar(200));
		if(!c1.deposito(500));
		System.out.println();
		c1.info();
		
		
		Conta c2 = new Conta(222,"Luigi",4000,600);
		
		
	    c1.transferir(c2,2000);
		c1.info();
		c2.info();
	}
	
 ;
}
