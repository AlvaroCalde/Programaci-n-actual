/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.appagenda;

/**
 *
 * @author alvaro.calper
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    /**
     *
     */
    public Contacto() {
    }

    /**
     *
     * @param nombre
     */
    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param nombre
     * @param telefono
     * @param email
     */
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve el contacto formateado
     * @return
     */
    @Override
    public String toString() {
        return nombre + "," + telefono + "," + email;
    }
    
    
}
