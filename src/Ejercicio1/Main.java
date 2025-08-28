package Ejercicio1;


public class Main {
    public static void main(String[] args) {

        Universidad uade = new Universidad("Universidad Argentina de la Empresa");

        Facultad informatica = new Facultad("Ingenieria en Informatica");

        informatica.agregarDepartamento(new Departamento("Matematicas"));
        informatica.agregarDepartamento(new Departamento("Informatica"));
        informatica.agregarDepartamento(new Departamento("Idiomas"));



        System.out.println(uade.toString());




    }
}