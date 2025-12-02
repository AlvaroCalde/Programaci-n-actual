/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.sauces.appbanco;

/**
 *
 * @author alvaro.calper
 */
public class Cuenta {
    private String codigo;    
    private String titular;
    private float saldo;

    public Cuenta(String codigo, String titular, float saldo) {
        this.codigo = codigo;
        this.titular = titular; 
        if(saldo>0){
            this.saldo = saldo;
        }
    }
    
    

    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(float saldo) {
        if(saldo>0){
            this.saldo = saldo;
        }
        
    }

    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of titular
     *
     * @param titular new value of titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Suma la cantidad especificada al saldo de la cuenta
     * @param cantidad 
     */
    public void ingresar(float cantidad){
        if(cantidad>0){
            saldo+=cantidad;
        }   
    }
    /**
     * Resta la cantidad especificada al saldo de la cuenta
     * @param cantidad 
     */
    public void reintegrar(float cantidad){
        if(cantidad>0){
            saldo-=cantidad;
        }   
    }
    /**
     * Muestra el contenido de la cuenta formateado
     * @return 
     */
    @Override
    public String toString() {
        return codigo + "," + titular + "," + saldo;
    }
    
    
    
}
