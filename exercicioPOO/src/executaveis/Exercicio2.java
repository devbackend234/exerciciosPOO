package executaveis;

import classes.ContaBancaria;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setTitular("João");
		conta1.setSaldo(500);
		conta1.depositar(200);
		conta1.sacar(100);
		conta1.sacar(1000);
		
	
	}

}
