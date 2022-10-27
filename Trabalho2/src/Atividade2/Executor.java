package Atividade2;

public class Executor {
	   public static void main(String[] args) throws InterruptedException {
		    Thread t = new Thread();
            //Nome, Rua, Endereço, Número da Casa, Salário, Residentes e Senha respectivamente
	        Pessoa pessoa1 = new Pessoa("Gustavo", "Rua UniFil", 150, 35000.50, 5, 123456);
	        System.out.println("Seus dados pessoais abaixo: ");
	        Thread.sleep(1000);
	        System.out.println("_________________________________");
	        System.out.println(" ");
	        System.out.println("Nome: " + pessoa1.getNome());
	        Thread.sleep(950); 
	        System.out.println("Endereco: " + pessoa1.getendereco());
	        Thread.sleep(950); 
	        System.out.println("Numero da casa: " + pessoa1.getnumeroCasa());
	        Thread.sleep(950); 
	        System.out.println("Salario: " + pessoa1.getsalario());
	        Thread.sleep(950); 
	        System.out.println("Residentes: " + pessoa1.getPessoasNaCasa());
	        Thread.sleep(950); 
	        System.out.println("Senha: " + pessoa1.getsenha());
	        System.out.println("Finalizado!");
	        System.out.println("_________________________________");
	    }
	}

