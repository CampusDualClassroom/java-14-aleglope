package com.campusdual.classroom;

/**
 * La clase {@code Doctor} representa a un doctor, extendiendo las características
 * básicas de una {@link Person} con una especialización específica.
 * <p>
 * Esta clase hereda los atributos y métodos de {@code Person} y añade
 * información adicional relacionada con la especialización médica.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Doctor extends Person {

	/**
	 * Especialización médica del doctor.
	 */
	protected String specialization;

	/**
	 * Constructor de la clase {@code Doctor} que inicializa el nombre, apellido
	 * y especialización del doctor.
	 *
	 * @param name           Nombre del doctor.
	 * @param surname        Apellido del doctor.
	 * @param specialization Especialización médica del doctor.
	 */
	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	/**
	 * Muestra por consola los detalles del doctor, incluyendo el nombre, apellido
	 * y su especialización.
	 * <p>
	 * Este método sobrescribe el método {@code getDetails()} de la clase {@code Person}
	 * para añadir información específica del doctor.
	 * </p>
	 */
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Specialization: " + this.specialization);
	}
}
