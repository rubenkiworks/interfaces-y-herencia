package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /**
         * Suponer la existencia de una fabrica ficticia de bicicletas,
         * donde se ensamblan bicis de montaña, de carrera, electricas,
         * etc.
         */

        /*
         * ¿Que es una Interface? Es un conjunto de metodos relacionados,
         * que pueden, en primer lugar, abstractos (que no tiene cuerpo),
         * static, default.
         * Y desde el punto de vista teorico/funcional una Interface es un CONTRATO
         * que se establece mediante el cual la clase que implemente dicha interface
         * se compromete a implementar todos los metodos de la interface aunque
         * solamente
         * vaya a utilizar uno solo.
         * Cuanda la clase implemente los metodos de la interface, no puede
         * violar/modificar
         * la firma del metodo
         * ¿Que es la firma del metodo?
         * Es el nombre del metodo, lo que recibe como parametro,
         * sin incluir lo que devuelve.
         */

        /*
         * HERENCIA:
         * 
         * Es un mecanismo mediante el cual una clase o interfaz hereda todos los
         * miembros
         * que sean public o protected.
         * 
         * Los constructores NO se heredan.
         */

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Ruben");
        estudiante1.setGenero(Genero.HOMBRE);

        // System.out.println(estudiante1);

        Estudiante estudiante2 = Estudiante.builder().nombre("ivan").genero(Genero.HOMBRE).totalAsignauras(10).build();

        System.out.println(estudiante2);

    }
}
