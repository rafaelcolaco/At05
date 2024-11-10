package Ex02;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
        Motor motor = new Motor();
        Carro carro = new Carro();

        System.out.println("Informações do Carro:");
        System.out.println(carro.toString());
        
        System.out.println("\nInformações do Motor:");
        System.out.println(motor.toString());

        System.out.println("\nInformações do Dono:");
        System.out.println(pessoa.toString());
	}

}
