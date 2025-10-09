
/**
 * Write a description of class Cuenta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuenta
{
    private String codigo;
    private String titular;
    private float saldo;
    
    public Cuenta(String codigo,String titular,float saldo){
        this.codigo=codigo;
        this.titular=titular;
        this.saldo=saldo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public void setTitular(String titular){
        this.titular=titular;
    }
    
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    
    public void ingresar(float cantidad){
        saldo+=cantidad;
    }
    
    public void reintegrar(float cantidad){
        saldo-=cantidad;
    }


    
}
