package Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Facultad {

    private String nombre;

    private List<Departamento> departamentos;

    public Facultad(String nombre){
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
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

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public String toString(){
        return ("Facultad{" +
                "nombre='" + nombre + '\'' +
                "departamentos='" + departamentos +
                "}");
    }




}
