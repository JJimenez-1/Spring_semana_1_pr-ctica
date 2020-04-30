package org.formacio.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServeiAlumnat {

	@Autowired
	private RepositoriAlumnes repositorio;
	
	@PostConstruct
	public void init() {
		añadirdosalumnos();
	}
	
	private void añadirdosalumnos() {
		repositorio.altaAlumne(1, "Antonia");
		repositorio.altaAlumne(2, "Joan");
	}
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		if(alumne!= null) {
			repositorio.altaAlumne(id, alumne);
			return true;
		} else {
			return false;
		}
	}
	
}
