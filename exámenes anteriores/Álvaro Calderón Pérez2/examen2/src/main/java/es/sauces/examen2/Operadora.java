/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.examen2;

import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Operadora {
    private String nombre;
    private Set<Tarifa> tarifas;
    private Map<String,LineaMovil> lineas;

    
    // COMPLETA EL CÓDIGO
    public Operadora(String nombre) {
        this.nombre = nombre;
        tarifas=new TreeSet();
        lineas=new TreeMap();
    }
    
    public String getNombre() {
        return nombre;
    }

    // COMPLETA EL CÓDIGO
    public List<Tarifa> getTarifas() {
        return new ArrayList<>(tarifas);
    }

    // COMPLETA EL CÓDIGO
    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas=new TreeSet<>(tarifas);
    }

    // COMPLETA EL CÓDIGO
    public List<LineaMovil> getLineas() {
        return null;
    }

    // COMPLETA EL CÓDIGO
    public void setLineas(List<LineaMovil> lineas) {
        this.lineas=new TreeMap();
    }
    
    // COMPLETA EL CÓDIGO
    public boolean agregarTarifa(Tarifa tarifa){
        boolean agregado=false;
        if(tarifa!=null){
            tarifas.add(tarifa);
            agregado=true;
        }
        return agregado;
    }
    
    // COMPLETA EL CÓDIGO
    public Tarifa getTarifa(String nombre){
        for(Tarifa t: tarifas){
            if(t.getNombre().equals(nombre)){
                return t;
            }
        }
        return null;
    }
    
    // COMPLETA EL CÓDIGO
    public boolean agregarLineaMovil(LineaMovil linea){
        boolean agregado=false;
        if(linea!=null){
            lineas.put(nombre, linea);
            agregado=true;
        }
        return agregado;
    }
    
    // COMPLETA EL CÓDIGO
    public LineaMovil getLineaMovil(String numero){
        return lineas.get(numero);       
    }
    
    // COMPLETA EL CÓDIGO
    public boolean cancelarLineaMovil(String numero){
        boolean eliminado=false;
        if(lineas!=null){
            lineas.remove(numero);
            eliminado=true;
        }
        return eliminado;
    }
}
