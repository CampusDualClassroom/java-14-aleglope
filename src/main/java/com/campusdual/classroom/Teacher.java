package com.campusdual.classroom;

/**
 * La clase {@code Teacher} representa a un profesor, extendiendo las características
 * básicas de una {@link Person} con un área de especialización educativa.
 * <p>
 * Esta clase hereda los atributos y métodos de {@code Person} y añade
 * información adicional relacionada con el área educativa.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Teacher extends Person {

	/**
	 * Área de especialización educativa del profesor.
	 */
	protected String area;

	/**
	 * Constructor de la clase {@code Teacher} que inicializa el nombre, apellido
	 * y área de especialización del profesor.
	 *
	 * @param name    Nombre del profesor.
	 * @param surname Apellido del profesor.
	 * @param area    Área de especialización educativa del profesor.
	 */
	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	/**
	 * Muestra por consola los detalles del profesor, incluyendo el nombre, apellido
	 * y su área de especialización educativa.
	 * <p>
	 * Este método sobrescribe el método {@code getDetails()} de la clase {@code Person}
	 * para añadir información específica del profesor.
	 * </p>
	 */
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Area: " + this.area);
	}
}
