package classes;


public class ContaBancaria {
private String titular;
private double saldo;

/*Metodos*/
public void ContaBancaria() {};
public void ContaBancaria(String titular, double saldo) {
	this.titular=titular;
	this.saldo=saldo;
}
public double  sacar(double saque) {
	if(saque>saldo) {
		System.out.println("Operação cancelada");
		System.out.println("Limite menor que o saque");
	}else {
		this.saldo-=saque;
	}
	return this.saldo;
		
}

public double  depositar(double deposito) {
	return this.saldo+=deposito;
		
}

public  void  contultarSaldo() {
	 System.out.println("Seu saldo é: "+ getSaldo());
}

/*Getters e Setters*/

public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}


	
}
