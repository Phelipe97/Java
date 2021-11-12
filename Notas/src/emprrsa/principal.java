package emprrsa;

public class principal {

	public static void main(String[] args) {
		
Nota phelipe=new Nota();
Nota raphael=new Nota(9,5,5);

System.out.println("media raphael");
raphael.resultado();
System.out.println();
phelipe.setNota1(9);
phelipe.setNota2(10);
phelipe.setFaltas(5);

phelipe.resultado();

phelipe.setNota1(2);
phelipe.setFaltas(10);

phelipe.resultado();

	}

}
