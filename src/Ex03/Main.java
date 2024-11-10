package Ex03;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos Almeida");
        pessoa.setEndereco("Av. Central, 1000");

        Banco banco = new Banco();
        banco.setCodigo(1);
        banco.setNome("Banco Central");
        banco.setNumeroAgencias(50);

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setAgencia(1234);
        contaBancaria.setNumeroDaConta(567890);
        contaBancaria.setCorrentista(pessoa);
        contaBancaria.setSaldo(500.0);

        ContaSimples contaSimples = new ContaSimples();
        contaSimples.depositoPoupanca(300.0);
        contaSimples.saquePoupanca(50.0);

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        cartaoDeCredito.setNumero(123456);
        cartaoDeCredito.setOperadora("Visa");
        cartaoDeCredito.setLimite(5000.0);
        cartaoDeCredito.setTipoDeCartao("Gold");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setAgencia(4321);
        contaEspecial.setNumeroDaConta(987654);
        contaEspecial.setCorrentista(pessoa);
        contaEspecial.setSaldo(1000.0);
        contaEspecial.setDiasSemJuros(30);
        contaEspecial.setLimite(10000.0);

        System.out.println("Informações do Correntista:");
        System.out.println(pessoa.toString());

        System.out.println("\nInformações do Banco:");
        System.out.println(banco.toString());

        System.out.println("\nInformações da Conta Bancária:");
        System.out.println(contaBancaria.toString());

        System.out.println("\nInformações da Conta Simples:");
        System.out.println(contaSimples.toString());

        System.out.println("\nInformações do Cartão de Crédito:");
        System.out.println(cartaoDeCredito.toString());

        System.out.println("\nInformações da Conta Especial:");
        System.out.println(contaEspecial.toString());

	}

}
