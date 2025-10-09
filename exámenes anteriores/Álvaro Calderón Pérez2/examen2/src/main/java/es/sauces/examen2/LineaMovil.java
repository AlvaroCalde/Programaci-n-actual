/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.examen2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// COMPLETA EL CÓDIGO
public class LineaMovil {
    private final String numero;
    private String cliente;
    private Tarifa tarifa;
    private int datosDisponibles;
    private List<Consumo> consumos;
    private static final Logger LOG = Logger.getLogger(LineaMovil.class.getName());
    

    
    // COMPLETA EL CÓDIGO
    public LineaMovil(String numero, String cliente, Tarifa tarifa) throws NumeroFormatException {
        String patron="([6 7])([0-9]{8})";
        Pattern p=Pattern.compile(patron);
        Matcher m=p.matcher(numero);
        if(!m.matches()){
            LOG.log(Level.INFO, "El número no se ajusta al patrón");
            throw new NumeroFormatException("El número no se ajusta al patrón");
        }else{
            this.numero = numero;
        }
        this.cliente = cliente;
        this.tarifa = tarifa;
        this.datosDisponibles=tarifa.getDatos()*1000;
        this.consumos=new LinkedList();
    }

    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public int getDatosDisponibles() {
        return datosDisponibles;
    }

    public void setDatosDisponibles(int datosDisponibles) {
        this.datosDisponibles = datosDisponibles;
    }

    public List<Consumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(List<Consumo> consumos) {
        this.consumos = consumos;
    }
    
    // COMPLETA EL CÓDIGO
    public float registrarLlamada(LocalDate fecha, LocalTime hora, String numero, int duracion){
        if(duracion<0){
            LOG.log(Level.INFO, "La duración no puede ser negativa");
            throw new IllegalArgumentException("La duración no puede ser negativa");
        }
        Llamada llamada=null;
        consumos.add(llamada);
        float importe=tarifa.getPrecioEstablecimiento()+Math.ceilDiv(duracion, 60)*tarifa.getPrecioMinuto();
        return importe;
    }
    
    // COMPLETA EL CÓDIGO
    public float registrarSms(LocalDate fecha, LocalTime hora, String numero){
        Sms sms=null;
        consumos.add(sms);
        float importe=tarifa.getPrecioSms();
        return importe;
    }
    
    // COMPLETA EL CÓDIGO
    public int registrarConsumoDatos(LocalDate fecha, LocalTime hora, int volumen) throws DatosException{
        if(volumen<0 || volumen>datosDisponibles){
            LOG.log(Level.INFO, "El volumen no puede ser negativo ni mayor a llos datos disponibles");
            throw new DatosException("El volumen no puede ser negativo ni mayor a llos datos disponibles");
        }
        Datos datos=null;
        consumos.add(datos);
        datosDisponibles=datosDisponibles-volumen;
        return datosDisponibles;
    }
    
    // COMPLETA EL CÓDIGO
    public List<Consumo> listarConsumos(TipoConsumo tipoConsumo){
        return consumos;
    }
    
    // COMPLETA EL CÓDIGO
    public List<Consumo> listarConsumos(LocalDate desde, LocalDate hasta){
        if(desde.isBefore((ChronoLocalDate) consumos) && hasta.isAfter((ChronoLocalDate) consumos)){
            return consumos;
        }
        return null;
    }
    
    // COMPLETA EL CÓDIGO
    public String getConsumo(TipoConsumo tipoConsumo){
        return null;
    }
    
    // COMPLETA EL CÓDIGO
    public Consumo getConsumoMayorImporte(){
        float importe=Float.MAX_VALUE;
        for(Consumo c: consumos){ 
            if(c.getImporte()<importe){
                importe=c.getImporte();   
            }    
        } 
        return consumos.get((int) importe);
    }
    
    // COMPLETA EL CÓDIGO
    public Llamada getLLamadaMayorDuracion(){
        int duracion=Integer.MAX_VALUE;
        Llamada llamada=null;
        for(Consumo c: consumos){
            if(c instanceof Llamada ll){  
                if(((Llamada) c).getDuracion()<duracion){
                    duracion=((Llamada) c).getDuracion();
                    llamada=ll;
                }              
            }
        }   
        return llamada; 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LineaMovil other = (LineaMovil) obj;
        return Objects.equals(this.numero, other.numero);
    }
    
    
    
    // COMPLETA EL CÓDIGO
    public int cargarConsumos(String archivo) throws DaoException{
        Path path;
        int contador;
        String linea;
        String[] lineaa;
        path=Paths.get(archivo);
        Consumo consumo = null;
        contador=0;
        try(BufferedReader entrada=Files.newBufferedReader(path)){
            linea=entrada.readLine();
            while(linea!=null){
                lineaa=linea.split(",");
                contador++;
                consumos.add(consumo);
                linea=entrada.readLine();
            }
        } catch (IOException ex) {
            LOG.log(Level.INFO, "No se ha podido cargar los archivos");
            throw new DaoException("Error al cargar los inmuebles en el archivo");
        }
        return contador;
    }
    
    // COMPLETA EL CÓDIGO
    public int guardarConsumos(String archivo) throws DaoException{
        Path path;
        int contador;
        path=Paths.get(archivo);
        contador=0;
            try(BufferedWriter salida = Files.newBufferedWriter(path)) 
            {
                for(Consumo c: consumos){
                    salida.write(c.getClass().getSimpleName() + "," + super.toString());
                    salida.newLine();
                    contador++;
                }
            }catch(IOException ioe){
                LOG.log(Level.INFO, "No se ha podido guardar los archivos");
                throw new DaoException("Error al guardar los inmuebles en el archivo");
            }
        return contador;
    }
}
