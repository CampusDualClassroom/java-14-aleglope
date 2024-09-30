package com.campusdual.classroom;

/**
 * La clase {@code Exercise14} contiene el método {@code main} que demuestra la
 * creación e interacción de objetos de las clases {@link Person}, {@link Teacher},
 * {@link PoliceOfficer} y {@link Doctor}.
 * <p>
 * En este ejercicio se muestran ejemplos de herencia y sobrescritura de métodos
 * mediante la invocación del método {@code getDetails()} en cada objeto.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Exercise14 {

    /**
     * Método principal que crea instancias de {@link Person}, {@link Teacher},
     * {@link PoliceOfficer} y {@link Doctor}, y muestra sus detalles por consola.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Creación de una instancia de Person
        Person p = new Person("John", "Smith");

        // Creación de una instancia de Teacher
        Teacher t = new Teacher("Maria", "Montessori", "Educación");

        // Creación de una instancia de PoliceOfficer
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");

        // Creación de una instancia de Doctor
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");

        // Mostrar detalles de cada objeto
        p.getDetails();
        System.out.println(); // Línea en blanco para separar la salida

        t.getDetails();
        System.out.println();

        po.getDetails();
        System.out.println();

        d.getDetails();
    }
}
