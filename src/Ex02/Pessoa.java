package Ex02;

public class Pessoa extends Carro {

	 private String nome = "João Silva";
	    private String endereco = "Rua das Flores, 123";

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (nome.length() > 0)
	            this.nome = nome;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        if (endereco.length() > 0)
	            this.endereco = endereco;
	    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pessoa [nome=");
			builder.append(nome);
			builder.append(", endereco=");
			builder.append(endereco);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}

	    
}
