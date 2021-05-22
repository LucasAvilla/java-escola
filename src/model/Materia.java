package model;

/**
 * Classe responsavel por armazenar os atributos e métodos do objeto Materia
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class Materia {

	// Declarando os atributos
	private int codigo;
	private String nome;

	// Método para acessar os atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
