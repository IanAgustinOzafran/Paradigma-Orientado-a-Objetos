package Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Universidad {

    private String nombre;

    private List<Facultad> facultades;

    public Universidad(String nombre){
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public List getFacultades(){
        return facultades;
    }

    //Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Metodos

    public void agregarFacultad(Facultad facultad){
        facultades.add(facultad);
    }

    public String toString(){
        return ("Facultades{" +
                "nombre='" + nombre + '\'' +
                ", facultades='" + facultades +
                "}");
    }
}
