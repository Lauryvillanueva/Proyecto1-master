package com.uninorte.proyecto1;

import com.orm.SugarRecord;

/**
 * Created by daniel on 16/04/17.
 */

public class Estudiante extends SugarRecord {
    private String name ;
    private Long materia;
    int state;

    public Estudiante(String namestud, int statestud, Materia mat) {
        name = namestud;
        state = statestud;
        materia=mat.getId();

    }

    public Estudiante() {    }

    public String getName() {
        return name;
    }

    public void setName(String namestud) {
        name = namestud;
    }

    public int getState() {
        return state;
    }

    public void setState(int statestud) {
        state = statestud;
    }

    public Long getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia.getId();
    }
}
