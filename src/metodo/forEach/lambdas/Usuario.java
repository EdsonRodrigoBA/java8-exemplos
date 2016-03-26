package metodo.forEach.lambdas;

/**
 * Classe para fazer exemplo no uso dos novos recursos do java.
 * @author Edson
 *
 */
public class Usuario {

	private String nome;

	private int idade;

	private boolean status;



	/**
	 * @param nome
	 * @param idade
	 * @param status
	 */
	public Usuario(String nome, int idade, boolean status) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Usuario [nome= " + nome + ", idade= " + idade + ", status= " + status + "]";
	}
	
	public void updateStatus(boolean status){
		this.status = status;
	}

}
