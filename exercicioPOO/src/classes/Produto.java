package classes;
public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	/*Metodos*/
	public void Produto() {}
	public void Produto(String nome, double preco, int quantidade) {
		this.nome=nome;
		if(preco  < 0) {
			if(quantidade<0) {
				System.out.println("Preço ou quantidade não pode ser negativo");	
			}	
		}else {
		
			this.preco=preco;
			this.quantidade=quantidade;
		}
		
	}
	
	public double  calcularTotal(double preco, int quantidade) {
		
		return  preco*quantidade;
				
	}
	
	public double aplicarDesconto(double percentual){
		if(percentual<0&&percentual>100) {
			System.out.println("Desconto deve estar entre 0% e 100%, valor informado fora do permitido");
		}
		double desconto=percentual*(getPreco()*getQuantidade());
		return desconto;
		
		
	}
	
	/* Getters e Setters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
