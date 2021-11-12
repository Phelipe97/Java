package emprrsa;

public class Nota {
private double nota1;
private double nota2;
private int faltas;

public Nota() {
	
}

public Nota(double nota1, double nota2, int faltas) {
	setNota1 (nota1);
	setNota2 (nota2);
	setFaltas (faltas);
}
public void setNota1(double nota) {
	if(nota<0||nota>10) {
		System.out.println("nota invalida");
		return;
	}
	nota1=nota;	
}
public void setNota2(double nota) {
	if(nota<0||nota>10) {
		System.out.println("nota invalida");
		return;
	}
	nota2=nota;	
}
public double getNota1(){
	return nota1;
}

public double getNota2(){
	return nota2;
}

public int getFaltas() {
	return faltas;
}
public void setFaltas(int faltas) {
	if(faltas>40||faltas <0) {
		System.out.println("NUMERO DE FALTAS INVALIDO");
		return;
	}
	this.faltas = faltas;
}
void resultado() {
	double media =(nota1+nota2)/2;
	System.out.println("MEDIA:"+media);
	if(faltas > 7) {
		System.out.println("REPROVADO POR FALTAS");
	}
	else if(media < 4) {
		System.out.println("REVROVADO POR NOTAS");
	}
	else if(media <7) {
		System.out.println("EXAME");
	}
	else {
		System.out.println("APROVADO");
	}
}
}
