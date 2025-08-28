package Ejercicio1;

public class Departamento {

    private String nombre;


    public Departamento(String nombre){
        this.nombre = nombre;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Metodos

    public String toString(){
        return "Departamentos{" +
                ", nombre ='" + nombre + '\'' +
                "}";
    }
}
