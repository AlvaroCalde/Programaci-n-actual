/*
 * Carvajal balón de oro
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.examen2;

import java.util.Comparator;

/**
 *
 * @author alvaro.calper
 */
public class ComparadorImporte implements Comparator<Consumo>{
    
    @Override
    public int compare(Consumo c1, Consumo c2) {
        return Float.compare(c1.getImporte(), c2.getImporte());
    }
}
