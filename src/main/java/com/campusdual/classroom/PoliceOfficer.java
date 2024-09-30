package com.campusdual.classroom;

/**
 * La clase {@code PoliceOfficer} representa a un oficial de policía, extendiendo
 * las características básicas de una {@link Person} con información específica
 * sobre su escuadrón.
 * <p>
 * Esta clase hereda los atributos y métodos de {@code Person} y añade
 * información adicional relacionada con el escuadrón al que pertenece.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class PoliceOfficer extends Person {

	/**
	 * Escuadrón al que pertenece el oficial de policía.
	 */
	protected String squad;

	/**
	 * Constructor de la clase {@code PoliceOfficer} que inicializa el nombre, apellido
	 * y escuadrón del oficial de policía.
	 *
	 * @param name    Nombre del oficial de policía.
	 * @param surname Apellido del oficial de policía.
	 * @param squad   Escuadrón al que pertenece el oficial de policía.
	 */
	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	/**
	 * Muestra por consola los detalles del oficial de policía, incluyendo el nombre, apellido
	 * y su escuadrón.
	 * <p>
	 * Este método sobrescribe el método {@code getDetails()} de la clase {@code Person}
	 * para añadir información específica del oficial de policía.
	 * </p>
	 */
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Squad: " + this.squad);
	}
}
