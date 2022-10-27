package Atividade2;

public class funcionario {
	  private String nome;
	    private int cpf;
	    private double salario;
	    
	    public void Funcionario() {
	    }

	    public void Funcionario(String nome, int cpf, double salario) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.salario = salario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getCpf() {
	        return cpf;
	    }

	    public void setCpf(int cpf) {
	        this.cpf = cpf;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }
	    
}
