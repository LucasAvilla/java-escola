package model;

import java.util.ArrayList;

/**
 * Classe responsavel por armazenar os atributos e métodos do objeto Professor
 * 
 * @author Lucas Igor A M Nogueira
 * @since 23 de fev. de 2021
 */

public class Professor extends Funcionario {

	// Declarando os atributos
	private ArrayList<Materia> listaMaterias;

	// Método para acessar os atributos
	public ArrayList<Materia> getListaMaterias() {
		return listaMaterias;
	}

	public void setListaMaterias(ArrayList<Materia> listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

}
