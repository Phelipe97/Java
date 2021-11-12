package empresa;

public class contaBanco {
	String nome;
	double saldo;
	
public contaBanco(String nome, double saldo) {
	super();
	this.nome = nome;
	this.saldo = saldo;
	}

void depositar (double valor) {
	if(valor <0) {
		throw new RuntimeException("Valor invalido");
	}
	saldo+=valor;
	
}
void sacar (double valor) {
	if(valor > saldo) {
		throw new RuntimeException("Saldo insulficiente");
	}
	if(valor <0) {
		throw new RuntimeException("Valor invalido");
	}
	saldo-=valor;
}
void transferir (double valor , contaBanco destino) {
	this.sacar(valor);
	destino.depositar(valor); 
}

void info() {
	System.out.println("------------");
	System.out.println("Nome :"+ nome);
	System.out.println("Saldo :"+ saldo);
}
}

