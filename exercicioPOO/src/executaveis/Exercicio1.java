package executaveis;

import classes.Funcionario;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Funcionario funcionario1= new Funcionario();
	 Funcionario funcionario2= new Funcionario("João","Diretor",25000);
	 funcionario1.exibirDados();
	 System.out.println("************************");
	 funcionario2.exibirDados();
	}

}
