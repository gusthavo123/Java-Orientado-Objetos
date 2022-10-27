package Atividade2;

public class Pessoa {

	private int numeroCasa;
	private String endereco;
	private double salario;
	private String Nome;
	private int pessoasNaCasa;
	private int senha;
	private float rendaPessoa;

	public Pessoa(String Nome ,String endereco, int numeroCasa, double salario, int pessoas, int senha) {
		this.setNome(Nome);
		this.numeroCasa = numeroCasa;
		this.endereco = endereco;
		this.salario = salario;
		this.setPessoasNaCasa(pessoas);
		this.senha = senha;
		this.rendaPessoa = (float) rendaPessoa;

	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String setendereco() {
		return endereco;
	}

	public String getendereco() {
		return endereco;
	}

	public double setsalario() {
		return salario;
	}

	public double getsalario() {
		return salario;
	}

	public int getPessoasNaCasa() {
		return pessoasNaCasa;
	}

	public void setPessoasNaCasa(double pessoas) {
		this.pessoasNaCasa = (int) pessoas;
	}
	
	public int getnumeroCasa () {
		return numeroCasa;
	}
	
	public int setnumeroCasa () {
		return numeroCasa;
	}
	
	public int getsenha () {
		return senha;
	}

    public int setsenha () {
    	return senha;
    }

}
