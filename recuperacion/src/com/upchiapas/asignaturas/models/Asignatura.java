package com.upchiapas.asignaturas.models;

public class Asignatura {
    private String materia;

    public Asignatura(String materia) {
        this.materia = materia;
    }

    public Asignatura() {
    }

    public String getMateria(String materia2) {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return   "\nMATERIA: " + materia;
    }
}
