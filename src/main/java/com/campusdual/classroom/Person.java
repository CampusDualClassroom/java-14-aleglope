package com.campusdual.classroom;

/**
 * La clase {@code Person} representa a una persona con nombre y apellido.
 * <p>
 * Esta clase sirve como clase base para otras especializaciones como {@link Doctor},
 * {@link Teacher} y {@link PoliceOfficer}, permitiendo la herencia de sus atributos
 * y métodos.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Person {

	/**
	 * Nombre de la persona.
	 */
	protected String name;

	/**
	 * Apellido de la persona.
	 */
	protected String surname;

	/**
	 * Constructor de la clase {@code Person} que inicializa el nombre y el apellido.
	 *
	 * @param name    Nombre de la persona.
	 * @param surname Apellido de la persona.
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * Muestra por consola los detalles de la persona, incluyendo el nombre y el apellido.
	 */
	public void getDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
	}
}
