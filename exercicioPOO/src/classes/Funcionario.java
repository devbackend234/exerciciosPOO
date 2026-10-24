package classes;

public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	/*Métodos*/
	
	public Funcionario(){	}
	public Funcionario(String nome,String cargo, double salario){
		this.setNome(nome);;
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	public  void exibirDados() {
		System.out.println("Nome: " +getNome());
		System.out.println("Cargo: "+ getCargo());
		System.out.println("Salario: "+getSalario());
	}
	
	/*Getters e Setters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
