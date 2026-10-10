/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author brann
 */
import java.time.LocalDate;

public class Cliente {

    private int id;
    private String nombre;
    private String telefono;
    private String correo;
    private LocalDate fechaRegistro;

    public Cliente(int id, String nombre, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaRegistro = LocalDate.now();
    }

    public int getId() { return id; }
    
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getTelefono() {
        return telefono; 
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono; 
    }

    public String getCorreo() {
        return correo; 
    }
    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro; 
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro; 
    }

    @Override
    public String toString() {
        return nombre + " (" + telefono + ")";
    }
}
