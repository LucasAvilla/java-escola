package model;

/**
 * Classe responsavel por armazenar os atributos e métodos do objeto contato
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */
public class Contato {

	// declarando os atributos do objeto contato
	private String celular;
	private String email;

	// Método para acessar os atributos
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
