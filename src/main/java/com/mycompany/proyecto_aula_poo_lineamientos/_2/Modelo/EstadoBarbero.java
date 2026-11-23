/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_aula_poo_lineamientos._2.Modelo;

/**
 *
 * @author brann
 */
public enum EstadoBarbero {
    ACTIVO("Activo"),
    INACTIVO("Inactivo"),
    DE_VACACIONES("De vacaciones");

    private final String etiqueta;

    EstadoBarbero(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public boolean puedeAtender() {
        return this == ACTIVO;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}
