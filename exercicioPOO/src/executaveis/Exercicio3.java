package executaveis;

import classes.Produto;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod1= new Produto();
		prod1.setNome("Memória Ram DDR 3 8GB");
		prod1.setPreco(80.00);
		prod1.setQuantidade(5);
		System.out.println("O valor Total é : R$ "+prod1.calcularTotal(80, 5));
		System.out.println("O  desconto de 10% é: R$ "+prod1.aplicarDesconto(10));
		System.out.println("O valor total após o desconto é de : R$ "+(prod1.calcularTotal(80, 5) - prod1.aplicarDesconto(10)));
	}

}
