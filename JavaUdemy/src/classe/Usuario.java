package classe;

public class Usuario {
	String nome;
	String email;

	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		}
		return false;

	}
}